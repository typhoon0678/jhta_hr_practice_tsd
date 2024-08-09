package co_templates.dto;

import java.util.List;

public class AttByDepDto {

    private String name;
    private List<AttByMonthDto> attByMonthDtoList;

    public AttByDepDto(String name, List<AttByMonthDto> attByMonthDtoList) {
        this.name = name;
        this.attByMonthDtoList = attByMonthDtoList;
    }

    public String getName() {
        return name;
    }

    public List<AttByMonthDto> getAttByMonthDtoList() {
        return attByMonthDtoList;
    }

}
