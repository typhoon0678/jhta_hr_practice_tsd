package co_templates.service;

import co_templates.dto.AttByDepDto;
import co_templates.dto.AttByMonthDto;
import co_templates.dto.EmpAttByMonthDto;
import co_templates.dto.EmpDailyRecordsDto;
import co_templates.repository.AttendanceRepository;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class TestService {

    private final AttendanceRepository attendanceRepository;

    public TestService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    public List<AttByDepDto> getAttendanceByDep() {
        List<EmpDailyRecordsDto> empDailyRecordsDtoList
                = attendanceRepository.getEmpDailyRecord();

        Map<String, Map<String, Map<String, List<EmpDailyRecordsDto>>>> empDailyRecordsMonthMap =
                empDailyRecordsDtoList.stream().collect(
                        Collectors.groupingBy(EmpDailyRecordsDto::getEmpName,
                                Collectors.groupingBy(dto -> dto.getDate().substring(0, 7),
                                        Collectors.groupingBy(EmpDailyRecordsDto::getEmployeeId)
                                )
                        )
                );

        List<AttByDepDto> attByDepDtoList = new ArrayList<>();
        List<AttByMonthDto> attByMonthDtoList = new ArrayList<>();
        List<EmpAttByMonthDto> empAttByMonthDtoList = new ArrayList<>();

        for (Map.Entry<String, Map<String, Map<String, List<EmpDailyRecordsDto>>>> entry : empDailyRecordsMonthMap.entrySet()) {
            for (Map.Entry<String, Map<String, List<EmpDailyRecordsDto>>> monthEntry : entry.getValue().entrySet()) {
                for (Map.Entry<String, List<EmpDailyRecordsDto>> attEntry : monthEntry.getValue().entrySet()) {

                    empAttByMonthDtoList.add(new EmpAttByMonthDto(attEntry.getKey(), attEntry.getValue()));
                }

                attByMonthDtoList.add(new AttByMonthDto(monthEntry.getKey(), empAttByMonthDtoList));
                empAttByMonthDtoList = new ArrayList<>();
            }

            attByDepDtoList.add(new AttByDepDto(entry.getKey(), attByMonthDtoList));
            attByMonthDtoList = new ArrayList<>();
        }


        return attByDepDtoList;
    }
}
