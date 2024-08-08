package co_templates.view;

import co_templates.entity.Attendance;
import co_templates.entity.Employee;

import java.util.List;
import java.util.Scanner;

// View 와 input 을 관리하는 클래스
public class HRView {

    private final Scanner scanner = new Scanner(System.in);

    // ==== 인적 자원 관리 시스템 ====  => 선택 번호 return
    public String selectSystemOption() {

        return null;
    }

    // ==== 근태 관리 ====  => 선택 번호 return
    public String selectAttendanceOption() {

        return null;
    }

    // ==== 근태 입력 ====  => 선택 사항
    public Employee inputEmployee() {

        return null;
    }

    // ==== 직원별 월별 근태 현황 ==== (선택사항)
    public void attendanceByEmployeeAndMonth(Employee employee, List<Attendance> attendanceList) {


    }

    // ==== 부서별 월별 근태 현황 ====
    public void attendanceByDepartmentAndMonth() {


    }
}
