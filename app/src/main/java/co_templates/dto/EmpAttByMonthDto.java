package co_templates.dto;

import java.util.List;

public class EmpAttByMonthDto {

    private String name;
    private List<EmpDailyRecordsDto> empDailyRecordsDtoList;
    private int workRate;
    private int workDay;
    private int absentDay;
    private int vacationDay;

    public EmpAttByMonthDto(String name, List<EmpDailyRecordsDto> empDailyRecordsDtoList) {
        this.name = name;
        this.empDailyRecordsDtoList = empDailyRecordsDtoList;
        this.workDay = (int) empDailyRecordsDtoList.stream().filter(dto -> dto.getStatusId().equals("status_01")).count();
        this.absentDay = (int) empDailyRecordsDtoList.stream().filter(dto -> dto.getStatusId().equals("status_02")).count();
        this.vacationDay = (int) empDailyRecordsDtoList.stream().filter(dto -> dto.getStatusId().equals("status_03")).count();
        this.workRate = Math.round((float) workDay / (workDay + absentDay + vacationDay) * 100);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<EmpDailyRecordsDto> getEmpDailyRecordsDtoList() {
        return empDailyRecordsDtoList;
    }

    public void setEmpDailyRecordsDtoList(List<EmpDailyRecordsDto> empDailyRecordsDtoList) {
        this.empDailyRecordsDtoList = empDailyRecordsDtoList;
    }

    public int getWorkRate() {
        return workRate;
    }

    public void setWorkRate(int workRate) {
        this.workRate = workRate;
    }

    public int getWorkDay() {
        return workDay;
    }

    public void setWorkDay(int workDay) {
        this.workDay = workDay;
    }

    public int getAbsentDay() {
        return absentDay;
    }

    public void setAbsentDay(int absentDay) {
        this.absentDay = absentDay;
    }

    public int getVacationDay() {
        return vacationDay;
    }

    public void setVacationDay(int vacationDay) {
        this.vacationDay = vacationDay;
    }
}
