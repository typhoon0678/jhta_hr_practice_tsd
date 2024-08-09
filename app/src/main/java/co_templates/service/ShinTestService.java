package co_templates.service;

import co_templates.dto.DepEmpMonthAttDto;
import co_templates.repository.AttendanceRepository;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class ShinTestService {
    AttendanceRepository attendanceRepository = new AttendanceRepository();
    List<DepEmpMonthAttDto> listDto;

    public void ShowTest(){
        listDto=attendanceRepository.getDepEmpMonthAtt();
        printDepEmpMonthAttSummary(listDto);

    }


    public void printDepEmpMonthAttSummary(List<DepEmpMonthAttDto> List) {
        Map<String, List<DepEmpMonthAttDto>> departmentMap = new LinkedHashMap<>();

        // DTO 리스트를 순회하면서 부서별로 그룹화
        for (DepEmpMonthAttDto dto : List) {
            String department = dto.getDepartment();
            if (!departmentMap.containsKey(department)) {
                departmentMap.put(department, new ArrayList<>());
            }
            departmentMap.get(department).add(dto);
        }

        // 부서별로 정렬된 결과 출력
        for (Map.Entry<String, List<DepEmpMonthAttDto>> entry : departmentMap.entrySet()) {
            String department = entry.getKey();
            List<DepEmpMonthAttDto> dtos = entry.getValue();
            System.out.println("부서: " + department);
            for (DepEmpMonthAttDto dto : dtos) {
                System.out.println(dto.toString());
                System.out.println(); // 각 DTO 간의 구분을 위한 공백 줄 추가
            }
        }
    }
}
