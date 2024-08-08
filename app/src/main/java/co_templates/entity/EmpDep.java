package co_templates.entity;

// Employee, Department 중간 테이블
public class EmpDep {

    private String empDepPK;
    private String employeeFK;
    private String departmentFK;

    public EmpDep(String empDepPK, String employeeFK, String departmentFK) {
        this.empDepPK = empDepPK;
        this.employeeFK = employeeFK;
        this.departmentFK = departmentFK;
    }

    public String getEmpDepPK() {
        return empDepPK;
    }

    public void setEmpDepPK(String empDepPK) {
        this.empDepPK = empDepPK;
    }

    public String getEmployeeFK() {
        return employeeFK;
    }

    public void setEmployeeFK(String employeeFK) {
        this.employeeFK = employeeFK;
    }

    public String getDepartmentFK() {
        return departmentFK;
    }

    public void setDepartmentFK(String departmentFK) {
        this.departmentFK = departmentFK;
    }
}
