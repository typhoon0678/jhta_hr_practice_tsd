package co_templates.repository;

import co_templates.entity.Attendance;
import co_templates.jdbc.ConnectionFactory;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;

// 근태 관리 레포지토리
public class AttendanceRepository {

    private final Connection connection;

    public AttendanceRepository() {
        try {
            this.connection = ConnectionFactory.getConnection();
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
    public boolean updateAttendance(int id, Attendance attendance) {

        return false;
    }

    // delete 근태 by id
    public boolean deleteAttendance(int id) {

        return false;
    }

    // get List<근태> by employeeId, month (선택사항)
    public List<Attendance> getAttendanceByEmployeeIdAndMonth(int employeeId, int month) {

        return null;
    }

    // get List<근태> by employeeId, departmentId
    public List<Attendance> getAttendanceByEmployeeIdAndDepartmentId(int employeeId, int departmentId) {

        return null;
    }

}
