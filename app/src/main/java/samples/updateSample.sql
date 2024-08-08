-- 근태 테이블의 메인키로 근무상태 수정 쿼리 --
-- att_53의 레코드의 status_pk를 수정 --
UPDATE ATTENDANCE
SET STATUS_PK = 'status_03'
WHERE ATTENDANCE_PK = 'att_53';

-- 근태 테이블의 사원 PK와 날짜로 근무상태 수정 쿼리 --
-- 사원 ID가 emp_01이고 날짜가 2024-01-09인 레코드의 컬럼 Status_PK를 status_02로 수정 --
UPDATE ATTENDANCE
SET STATUS_PK = 'status_02'
WHERE EMPLOYEE_PK = 'emp_01'
  AND DATE = '2024-01-09';