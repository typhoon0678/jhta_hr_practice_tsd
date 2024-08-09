package co_templates.service;

import co_templates.dto.AttByDepDto;
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

        Map<String, List<EmpDailyRecordsDto>> empDailyRecordsDtoMap =
                empDailyRecordsDtoList.stream().collect(
                        Collectors.groupingBy(EmpDailyRecordsDto::getDepartmentId)
                );

        List<AttByDepDto> attByDepDtoList = new ArrayList<>();

        for (Map.Entry<String, List<EmpDailyRecordsDto>> entry : empDailyRecordsDtoMap.entrySet()) {
//            attByDepDtoList.add()
        }
        return null;
    }
}
