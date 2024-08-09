package co_templates.dto;

public class DepEmpMonthAttDto {
    private String department;
    private String employeeId;
    private String employeeName;
    private String month;
    private int daysPresent;
    private int daysAbsent;
    private int daysOnLeave;

    private static final int TOTAL_DAYS_IN_MONTH = 24; // 한 달 기준


    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        this.department = department;
    }

    public String getEmployeeId() {
        return employeeId;
    }

    public void setEmployeeId(String employeeId) {
        this.employeeId = employeeId;
    }

    public String getEmployeeName() {
        return employeeName;
    }

    public void setEmployeeName(String employeeName) {
        this.employeeName = employeeName;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public int getDaysPresent() {
        return daysPresent;
    }

    public void setDaysPresent(int daysPresent) {
        this.daysPresent = daysPresent;
    }

    public int getDaysAbsent() {
        return daysAbsent;
    }

    public void setDaysAbsent(int daysAbsent) {
        this.daysAbsent = daysAbsent;
    }

    public int getDaysOnLeave() {
        return daysOnLeave;
    }

    public void setDaysOnLeave(int daysOnLeave) {
        this.daysOnLeave = daysOnLeave;
    }

    public double getAbsentPercentage() {
        return (daysAbsent / (double) TOTAL_DAYS_IN_MONTH) * 100;
    }

    @Override
    public String toString() {
        return String.format("  직원 ID: %s, 이름: %s\n  - 년월: %s\n  - 출근: %d일, 퇴근: %d일, 휴가: %d일\n  - 출근 비율: %.2f%%",
                 employeeId, employeeName, month, daysPresent, daysAbsent, daysOnLeave, getAbsentPercentage());
    }
}
