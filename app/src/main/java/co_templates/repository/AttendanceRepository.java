package co_templates.repository;

import co_templates.entity.Attendance;
import co_templates.dto.EmpDailyRecordsDto;
import co_templates.jdbc.ConnectionFactory;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;

// 근태 관리 레포지토리
public class AttendanceRepository {

    private final Connection connection;
    private final Statement stmt;

    public AttendanceRepository() {
        try {
            this.connection = ConnectionFactory.getConnection();
            this.stmt = connection.createStatement();
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
    }

    // get 근태 by id
    public Attendance getAttendance(int id) {

        return null;
    }

    // insert 근태 (선택사항)
    public boolean addAttendance(Attendance attendance) {

        return false;
    }

    // update 근태 by id
    public boolean updateAttendance(Attendance attendance) {

        String sql = "UPDATE ATTENDANCE " +
                "SET STATUS_PK = '" + attendance.getStatusFK() + "' " +
                "WHERE EMPLOYEE_PK = '" + attendance.getEmployeeFK() + "' " +
                "AND DATE = '" + attendance.getDate() + "' ";
        try {
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            return false;
        }

    }

    // delete 근태 by id
    public boolean deleteAttendance(Attendance attendance) {

        String sql = "DELETE FROM ATTENDANCE" +
                " WHERE EMPLOYEE_PK = '" + attendance.getEmployeeFK() + "'" +
                " AND DATE = '" + attendance.getDate() + "'";

        try {
            stmt.executeUpdate(sql);
            return true;
        } catch (SQLException e) {
            return false;
        }
    }

    // get List<근태> by employeeId, month (선택사항)
    public List<Attendance> getAttendanceByEmployeeIdAndMonth(int employeeId, int month) {

        return null;
    }



    public List<EmpDailyRecordsDto> getEmpDailyRecord() {
        String sql = "SELECT " +
                "    a.DATE, " +
                "    e.EMPLOYEE_PK, " +
                "    e.EMP_NAME, " +
                "    ed.DEPARTMENT_PK, " +
                "    a.STATUS_PK " +
                "FROM " +
                "    ATTENDANCE a " +
                "JOIN " +
                "    EMPLOYEE e ON a.EMPLOYEE_PK = e.EMPLOYEE_PK " +
                "JOIN " +
                "    EMP_DEP ed ON e.EMPLOYEE_PK = ed.EMPLOYEE_PK " +
                "JOIN " +
                "    DEPARTMENT d ON ed.DEPARTMENT_PK = d.DEPARTMENT_PK " +
                "WHERE " +
                "    a.DATE IS NOT NULL " +
                "ORDER BY " +
                "    a.DATE, e.EMPLOYEE_PK";

        List<EmpDailyRecordsDto> records = new ArrayList<>();
        try {
            ResultSet rs = stmt.executeQuery(sql);

            while (rs.next()) {
                EmpDailyRecordsDto record = new EmpDailyRecordsDto(
                        rs.getString("DATE"),
                        rs.getString("EMPLOYEE_PK"),
                        rs.getString("EMP_NAME"),
                        rs.getString("DEPARTMENT_PK"),
                        rs.getString("STATUS_PK")
                );
                records.add(record);
            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        for (EmpDailyRecordsDto record : records) {
            System.out.println("Date: " + record.getDate());
            System.out.println("Employee ID: " + record.getEmployeeId());
            System.out.println("Employee Name: " + record.getEmpName());
            System.out.println("Department ID: " + record.getDepartmentId());
            System.out.println("Status ID: " + record.getStatusId());
            System.out.println("-----------------------------");
        }
        return records;
    }

}
