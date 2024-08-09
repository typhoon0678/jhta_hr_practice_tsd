package co_templates.dto;

import java.util.List;

public class AttByMonthDto {

    private String dateMonth;
    private List<EmpAttByMonthDto> empAttByMonthDtoList;

    public AttByMonthDto(String dateMonth, List<EmpAttByMonthDto> empAttByMonthDtoList) {
        this.dateMonth = dateMonth;
        this.empAttByMonthDtoList = empAttByMonthDtoList;
    }

    public String getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(String dateMonth) {
        this.dateMonth = dateMonth;
    }

    public List<EmpAttByMonthDto> getEmpAttByMonthDtoList() {
        return empAttByMonthDtoList;
    }

    public void setEmpAttByMonthDtoList(List<EmpAttByMonthDto> empAttByMonthDtoList) {
        this.empAttByMonthDtoList = empAttByMonthDtoList;
    }
}
