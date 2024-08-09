
-- 특정 EMP_PK의 값으로 근태 전체 조회
SELECT *
FROM ATTENDANCE
WHERE EMPLOYEE_PK = 'emp_01'
ORDER BY DATE;

-- ATTENDANCE테이블의 DATE별로
-- EMPLOYEE_PK
-- EMP_NAME
-- DEPARTMENT_PK
-- STATUS_PK
-- 조회하는 쿼리

SELECT
    a.DATE,
    e.EMPLOYEE_PK,
    e.EMP_NAME,
    ed.DEPARTMENT_PK,
    a.STATUS_PK
FROM
    ATTENDANCE a
        JOIN
    EMPLOYEE e ON a.EMPLOYEE_PK = e.EMPLOYEE_PK
        JOIN
    EMP_DEP ed ON e.EMPLOYEE_PK = ed.EMPLOYEE_PK
        JOIN
    DEPARTMENT d ON ed.DEPARTMENT_PK = d.DEPARTMENT_PK
WHERE
    a.DATE IS NOT NULL
ORDER BY
    a.DATE, e.EMPLOYEE_PK;


-- 부서, 직원ID, 직원명, 년월별, 출,퇴근,휴가(카운팅) 조회 --
SELECT d.DEP_NAME AS Department, e.EMPLOYEE_PK , e.EMP_NAME,
       DATE_FORMAT(a.DATE, '%Y-%m') AS Month,
       COUNT(CASE WHEN s.STATUS = '출근' THEN 1 END) AS DaysPresent,
       COUNT(CASE WHEN s.STATUS = '휴가' THEN 1 END) AS DaysOnLeave,
       COUNT(CASE WHEN s.STATUS = '퇴근' THEN 1 END) AS DaysAbsent
FROM ATTENDANCE a
    JOIN EMPLOYEE e ON a.EMPLOYEE_PK = e.EMPLOYEE_PK
    JOIN STATUS s ON a.STATUS_PK = s.STATUS_PK
    JOIN EMP_DEP ed ON e.EMPLOYEE_PK = ed.EMPLOYEE_PK
    JOIN DEPARTMENT d ON ed.DEPARTMENT_PK = d.DEPARTMENT_PK
GROUP BY d.DEP_NAME, e.EMPLOYEE_PK, e.EMP_NAME, DATE_FORMAT(a.DATE, '%Y-%m')
ORDER BY d.DEP_NAME, e.EMPLOYEE_PK, Month;


-- 부서, 직원ID, 직원명, 년월별, 출,퇴근,휴가(카운팅), 출근율 조회 --
WITH AttendanceSummary AS (
    SELECT d.DEP_NAME AS Department, e.EMPLOYEE_PK , e.EMP_NAME ,
           DATE_FORMAT(a.DATE, '%Y-%m') AS Month,
    COUNT(CASE WHEN s.STATUS = '출근' THEN 1 END) AS DaysPresent,
    COUNT(CASE WHEN s.STATUS = '휴가' THEN 1 END) AS DaysOnLeave,
    COUNT(CASE WHEN s.STATUS = '퇴근' THEN 1 END) AS DaysAbsent
FROM ATTENDANCE a
    JOIN EMPLOYEE e ON a.EMPLOYEE_PK = e.EMPLOYEE_PK
    JOIN STATUS s ON a.STATUS_PK = s.STATUS_PK
    JOIN EMP_DEP ed ON e.EMPLOYEE_PK = ed.EMPLOYEE_PK
    JOIN DEPARTMENT d ON ed.DEPARTMENT_PK = d.DEPARTMENT_PK
GROUP BY d.DEP_NAME, e.EMPLOYEE_PK, e.EMP_NAME, DATE_FORMAT(a.DATE, '%Y-%m')
    ),
    PercentageSummary AS (
SELECT Department, UserID, Employee, Month,
    DaysPresent, DaysOnLeave, DaysAbsent,
    24 AS TotalDays,  -- Assume every month has 24 days
    ROUND((DaysAbsent / 24.0) * 100, 2) AS AbsentPercentage
FROM AttendanceSummary
    )
SELECT Department, UserID, Employee, Month,
    DaysPresent, DaysOnLeave, DaysAbsent,
    AbsentPercentage
FROM PercentageSummary
ORDER BY Department, UserID, Month;