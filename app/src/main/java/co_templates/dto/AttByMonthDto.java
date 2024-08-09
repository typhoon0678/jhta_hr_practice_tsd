package co_templates.dto;

import java.util.List;

public class AttByMonthDto {

    private String dateMonth;
    private String year;
    private String month;
    private List<EmpAttByMonthDto> empAttByMonthDtoList;

    public AttByMonthDto(String dateMonth, List<EmpAttByMonthDto> empAttByMonthDtoList) {
        this.dateMonth = dateMonth;
        this.year = dateMonth.substring(0, 4);
        this.month = dateMonth.substring(5, 7);
        this.empAttByMonthDtoList = empAttByMonthDtoList;
    }

    public String getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(String dateMonth) {
        this.dateMonth = dateMonth;
    }

    public String getYear() {
        return year;
    }

    public void setYear(String year) {
        this.year = year;
    }

    public String getMonth() {
        return month;
    }

    public void setMonth(String month) {
        this.month = month;
    }

    public List<EmpAttByMonthDto> getEmpAttByMonthDtoList() {
        return empAttByMonthDtoList;
    }

    public void setEmpAttByMonthDtoList(List<EmpAttByMonthDto> empAttByMonthDtoList) {
        this.empAttByMonthDtoList = empAttByMonthDtoList;
    }
}
