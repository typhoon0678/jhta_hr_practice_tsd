INSERT INTO `EMPLOYEE` (`EMPLOYEE_PK`, `EMP_NAME`)
VALUES ('emp_01', '김태환'),
       ('emp_02', '박신혁'),
       ('emp_03', '이도경'),
       ('emp_04', '이태석'),
       ('emp_05', '박태환'),
       ('emp_06', '김수현');

INSERT INTO `STATUS` (`STATUS_PK`, `STATUS`)
VALUES ('status_01', '출근'),
       ('status_02', '휴가'),
       ('status_03', '퇴근');

INSERT INTO `DEPARTMENT` (`DEPARTMENT_PK`, `DEP_NAME`)
VALUES ('dep_01', '영업팀'),
       ('dep_02', '개발팀'),
       ('dep_03', '기획팀'),
       ('dep_04', '회계팀');


INSERT INTO `ATTENDANCE` (`ATTENDANCE_PK`, `EMPLOYEE_PK`, `STATUS_PK`, `DATE`)
VALUES
-- 2024년 1월 1일
('att_01', 'emp_01', 'status_03', '2024-01-01'),
('att_02', 'emp_02', 'status_03', '2024-01-01'),
('att_03', 'emp_03', 'status_03', '2024-01-01'),
('att_04', 'emp_04', 'status_02', '2024-01-01'),
('att_05', 'emp_05', 'status_02', '2024-01-01'),
('att_06', 'emp_06', 'status_03', '2024-01-01'),

-- 2024년 1월 2일
('att_07', 'emp_01', 'status_03', '2024-01-02'),
('att_08', 'emp_02', 'status_03', '2024-01-02'),
('att_09', 'emp_03', 'status_03', '2024-01-02'),
('att_10', 'emp_04', 'status_03', '2024-01-02'),

-- 2024년 1월 3일
('att_11', 'emp_01', 'status_03', '2024-01-03'),
('att_12', 'emp_02', 'status_03', '2024-01-03'),
('att_13', 'emp_03', 'status_02', '2024-01-03'),
('att_14', 'emp_04', 'status_03', '2024-01-03'),
('att_15', 'emp_05', 'status_03', '2024-01-03'),
('att_16', 'emp_06', 'status_03', '2024-01-03'),

-- 2024년 1월 4일
('att_17', 'emp_01', 'status_03', '2024-01-04'),
('att_18', 'emp_02', 'status_03', '2024-01-04'),
('att_19', 'emp_03', 'status_03', '2024-01-04'),
('att_20', 'emp_04', 'status_03', '2024-01-04'),
('att_21', 'emp_05', 'status_03', '2024-01-04'),
('att_22', 'emp_06', 'status_03', '2024-01-04'),

-- 2024년 1월 5일
('att_23', 'emp_01', 'status_03', '2024-01-05'),
('att_24', 'emp_02', 'status_03', '2024-01-05'),
('att_25', 'emp_03', 'status_02', '2024-01-05'),
('att_26', 'emp_04', 'status_03', '2024-01-05'),
('att_27', 'emp_05', 'status_03', '2024-01-05'),
('att_28', 'emp_06', 'status_03', '2024-01-05'),

-- 2024년 1월 6일
('att_29', 'emp_01', 'status_03', '2024-01-06'),
('att_30', 'emp_02', 'status_03', '2024-01-06'),
('att_31', 'emp_03', 'status_03', '2024-01-06'),
('att_32', 'emp_04', 'status_03', '2024-01-06'),
('att_33', 'emp_05', 'status_03', '2024-01-06'),
('att_34', 'emp_06', 'status_02', '2024-01-06'),

-- 2024년 1월 7일
('att_35', 'emp_01', 'status_03', '2024-01-07'),
('att_36', 'emp_02', 'status_03', '2024-01-07'),
('att_37', 'emp_03', 'status_03', '2024-01-07'),
('att_38', 'emp_04', 'status_03', '2024-01-07'),
('att_39', 'emp_05', 'status_03', '2024-01-07'),
('att_40', 'emp_06', 'status_03', '2024-01-07'),

-- 2024년 1월 8일
('att_41', 'emp_01', 'status_03', '2024-01-08'),
('att_42', 'emp_02', 'status_03', '2024-01-08'),
('att_43', 'emp_03', 'status_03', '2024-01-08'),
('att_44', 'emp_04', 'status_03', '2024-01-08'),
('att_45', 'emp_05', 'status_03', '2024-01-08'),
('att_46', 'emp_06', 'status_03', '2024-01-08'),

-- 2024년 1월 9일
('att_47', 'emp_01', 'status_03', '2024-01-09'),
('att_48', 'emp_02', 'status_03', '2024-01-09'),
('att_49', 'emp_03', 'status_02', '2024-01-09'),
('att_50', 'emp_04', 'status_02', '2024-01-09'),
('att_51', 'emp_05', 'status_03', '2024-01-09'),
('att_52', 'emp_06', 'status_03', '2024-01-09'),

-- 2024년 1월 10일
('att_53', 'emp_01', 'status_01', '2024-01-10'),
('att_54', 'emp_02', 'status_01', '2024-01-10'),
('att_55', 'emp_03', 'status_01', '2024-01-10'),
('att_56', 'emp_04', 'status_03', '2024-01-10'),
('att_57', 'emp_05', 'status_02', '2024-01-10'),
('att_58', 'emp_06', 'status_01', '2024-01-10');


INSERT INTO `EMP_DEP` (`EMP_DEP_PK`, `EMPLOYEE_PK`, `DEPARTMENT_PK`)
VALUES ('emp_dep_01', 'emp_01', 'dep_01'),
       ('emp_dep_02', 'emp_02', 'dep_02'),
       ('emp_dep_03', 'emp_03', 'dep_03'),
       ('emp_dep_04', 'emp_04', 'dep_04'),
       ('emp_dep_05', 'emp_05', 'dep_01'),
       ('emp_dep_06', 'emp_06', 'dep_03');

