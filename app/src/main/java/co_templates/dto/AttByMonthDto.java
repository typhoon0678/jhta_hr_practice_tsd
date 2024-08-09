package co_templates.dto;

import java.util.List;

public class AttByMonthDto {

    private String dateMonth;
    private List<EmpAttByDepDto> empAttByDepDtoList;

    public AttByMonthDto(String dateMonth, List<EmpAttByDepDto> empAttByDepDtoList) {
        this.dateMonth = dateMonth;
        this.empAttByDepDtoList = empAttByDepDtoList;
    }

    public String getDateMonth() {
        return dateMonth;
    }

    public void setDateMonth(String dateMonth) {
        this.dateMonth = dateMonth;
    }

    public List<EmpAttByDepDto> getEmpAttByDepDtoList() {
        return empAttByDepDtoList;
    }

    public void setEmpAttByDepDtoList(List<EmpAttByDepDto> empAttByDepDtoList) {
        this.empAttByDepDtoList = empAttByDepDtoList;
    }
}
