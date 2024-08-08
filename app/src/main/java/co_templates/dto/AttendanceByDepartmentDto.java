package co_templates.dto;


// 부서별 월별 근태 DTO
public class AttendanceByDepartmentDto {

    // variable
    // 직원 ID, 이름, 출근, 결근, 휴가
    private final String id;
    private final String name;
    private final int workDay; // 출근
    private final int offDay; // 결근
    private final int vacationDay; // 휴가
    private final int attendanceRate;

    public AttendanceByDepartmentDto(String id, String name, int workDay, int offDay, int vacationDay) {
        this.id = id;
        this.name = name;
        this.workDay = workDay;
        this.offDay = offDay;
        this.vacationDay = vacationDay;
        this.attendanceRate = (int) Math.round(workDay / 24.0);
    }

    // getter, setter
}
