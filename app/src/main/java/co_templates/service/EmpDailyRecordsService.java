package co_templates.service;

import co_templates.dto.EmpDailyRecordsDto;
import co_templates.repository.AttendanceRepository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class EmpDailyRecordsService {
    private final AttendanceRepository attendanceRepository;

    public EmpDailyRecordsService(AttendanceRepository attendanceRepository) {
        this.attendanceRepository = attendanceRepository;
    }

    List<String> empList;
    Map<String, List<String>> empDailyMap = new HashMap<>();
    Map<String,Map<String,List<String>>> depEmpDailyMap = new HashMap<>();

    public void viewAllEmpDaily() {
        List<EmpDailyRecordsDto> empDailyDtoList
                = attendanceRepository.getEmpDailyRecord();


        for (EmpDailyRecordsDto recordDto : empDailyDtoList) {
            // 각 recordDto 객체에서 값을 조회합니다.
            String departmentId = recordDto.getDepartmentId();
            String employeeId = recordDto.getEmployeeId();
            String empName = recordDto.getEmpName();
            String date = recordDto.getDate();
            String statusId = recordDto.getStatusId();

            depEmpDailyMap.put(departmentId,new HashMap<>());
            depEmpDailyMap.get(departmentId).put(employeeId,new ArrayList<>());
            depEmpDailyMap.get(departmentId).get(employeeId).add(empName);

        }

    }
}
