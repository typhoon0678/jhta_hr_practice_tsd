package co_templates.dto;

public class AttendanceInputDto {

    private String employeeFK;
    private String date;
    private String statusFK;

    public AttendanceInputDto(String employeeFK, String date) {
        this.employeeFK = employeeFK;
        this.date = date;
    }

    public AttendanceInputDto(String employeeFK, String date, String statusFK) {
        this.employeeFK = employeeFK;
        this.date = date;
        this.statusFK = statusFK;
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
