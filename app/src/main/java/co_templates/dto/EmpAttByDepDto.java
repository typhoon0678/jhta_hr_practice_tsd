package co_templates.dto;


// 부서별 월별 근태 DTO
public class EmpAttByDepDto {

    // variable
    // 직원 ID, 이름, 출근, 결근, 휴가
    private String id;
    private String name;
    private int workDay; // 출근
    private int offDay; // 결근
    private int vacationDay; // 휴가
    private int attendanceRate;

    public EmpAttByDepDto(String id, String name, int workDay, int offDay, int vacationDay) {
        this.id = id;
        this.name = name;
        this.workDay = workDay;
        this.offDay = offDay;
        this.vacationDay = vacationDay;
        this.attendanceRate = (int) Math.round(workDay / 24.0);
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getOffDay() {
        return offDay;
    }

    public void setOffDay(int offDay) {
        this.offDay = offDay;
    }

    public int getVacationDay() {
        return vacationDay;
    }

    public void setVacationDay(int vacationDay) {
        this.vacationDay = vacationDay;
    }

    public int getAttendanceRate() {
        return attendanceRate;
    }

    public void setAttendanceRate(int attendanceRate) {
        this.attendanceRate = attendanceRate;
    }
}
