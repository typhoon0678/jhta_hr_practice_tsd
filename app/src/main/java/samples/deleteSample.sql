-- 1. ATTENDANCE 테이블의 데이터 삭제
DELETE
FROM ATTENDANCE
WHERE ATTENDANCE_PK IN ('att_01', 'att_02', 'att_03', 'att_04', 'att_05', 'att_06',
                        'att_07', 'att_08', 'att_09', 'att_10', 'att_11', 'att_12',
                        'att_13', 'att_14', 'att_15', 'att_16', 'att_17', 'att_18',
                        'att_19', 'att_20', 'att_21', 'att_22', 'att_23', 'att_24',
                        'att_25', 'att_26', 'att_27', 'att_28', 'att_29', 'att_30',
                        'att_31', 'att_32', 'att_33', 'att_34', 'att_35', 'att_36',
                        'att_37', 'att_38', 'att_39', 'att_40', 'att_41', 'att_42',
                        'att_43', 'att_44', 'att_45', 'att_46', 'att_47', 'att_48',
                        'att_49', 'att_50', 'att_51', 'att_52', 'att_53', 'att_54',
                        'att_55', 'att_56', 'att_57', 'att_58');

-- 2. EMP_DEP 테이블의 데이터 삭제
DELETE
FROM EMP_DEP
WHERE EMP_DEP_PK IN ('emp_dep_01', 'emp_dep_02', 'emp_dep_03', 'emp_dep_04', 'emp_dep_05', 'emp_dep_06');

-- 3. EMPLOYEE 테이블의 데이터 삭제
DELETE
FROM EMPLOYEE
WHERE EMPLOYEE_PK IN ('emp_01', 'emp_02', 'emp_03', 'emp_04', 'emp_05', 'emp_06');

-- 4. STATUS 테이블의 데이터 삭제
DELETE
FROM STATUS
WHERE STATUS_PK IN ('status_01', 'status_02', 'status_03');

-- 5. DEPARTMENT 테이블의 데이터 삭제
DELETE
FROM DEPARTMENT
WHERE DEPARTMENT_PK IN ('dep_01', 'dep_02', 'dep_03', 'dep_04');




-- 근태 테이블의 메인키로 해당 레코드 삭제
-- ex) att_01의 레코드 삭제 --
DELETE FROM ATTENDANCE
WHERE ATTENDANCE_PK = 'att_01';

-- 근태 테이블의 사원ID와 날짜로 해당 레코드 삭제 --
-- ex) emp_01, 2024_01_09 레코드 삭제 --
DELETE FROM ATTENDANCE
WHERE EMPLOYEE_PK = 'emp_01'
  AND DATE = '2024-01-09';