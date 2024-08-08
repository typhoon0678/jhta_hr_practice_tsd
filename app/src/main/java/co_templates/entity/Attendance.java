package co_templates.entity;

// 근태
public class Attendance {

    // variable
    private String attendancePK;
    private String employeeFK;
    private String date;
    private String statusFK;

    public String getAttendancePK() {
        return attendancePK;
    }

    public void setAttendancePK(String attendancePK) {
        this.attendancePK = attendancePK;
    }

    public String getEmployeeFK() {
        return employeeFK;
    }

    public void setEmployeeFK(String employeeFK) {
        this.employeeFK = employeeFK;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getStatusFK() {
        return statusFK;
    }

    public void setStatusFK(String statusFK) {
        this.statusFK = statusFK;
    }
}
