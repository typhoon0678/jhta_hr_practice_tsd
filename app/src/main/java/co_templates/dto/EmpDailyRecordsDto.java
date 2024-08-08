package co_templates.dto;

public class EmpDailyRecordsDto {
    private String date;
    private String employeeId;
    private String empName;
    private String departmentId;
    private String statusId;


    public EmpDailyRecordsDto(String date,
                              String employeeId,
                              String empName,
                              String departmentId,
                              String statusId) {
        this.date = date;
        this.employeeId = employeeId;
        this.empName = empName;
        this.departmentId = departmentId;
        this.statusId = statusId;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmpName() {
        return empName;
    }

    public void setEmpName(String empName) {
        this.empName = empName;
    }

    public String getDepartmentId() {
        return departmentId;
    }

    public void setDepartmentId(String departmentId) {
        this.departmentId = departmentId;
    }

    public String getStatusId() {
        return statusId;
    }

    public void setStatusId(String statusId) {
        this.statusId = statusId;
    }
}
