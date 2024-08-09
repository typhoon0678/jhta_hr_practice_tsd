package co_templates.dto;

import java.util.List;

public class EmpAttByMonthDto {

    private String name;
    private List<EmpDailyRecordsDto> empDailyRecordsDtoList;

    public EmpAttByMonthDto(String name, List<EmpDailyRecordsDto> empDailyRecordsDtoList) {
        this.name = name;
        this.empDailyRecordsDtoList = empDailyRecordsDtoList;
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
}
