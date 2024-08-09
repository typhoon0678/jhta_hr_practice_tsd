package co_templates.view;

import co_templates.dto.AttendanceInputDto;
import co_templates.entity.Attendance;
import co_templates.entity.Employee;

import java.util.List;
import java.util.Scanner;

// View 와 input 을 관리하는 클래스
public class HRView {

    private final Scanner scanner = new Scanner(System.in);

    // ==== 인적 자원 관리 시스템 ====  => 선택 번호 return
    public String selectSystemOption() {

        System.out.print("""
                                
                ==== 인적 자원 관리 시스템 ====
                                
                1. 조직/직무 관리
                2. 인사행정
                3. 근태 관리 *
                4. 급여/정산
                5. 사회보험
                6. 평가 관리
                7. 연말정산
                8. 승진 관리
                9. 핵심 인재 관리
                10. 월별 종합 현황 보기
                0. 종료 *
                                
                선택하세요 :\s""");

        return scanner.nextLine();
    }

    // ==== 근태 관리 ====  => 선택 번호 return
    public String selectAttendanceOption() {

        System.out.print("""
                                
                ==== 근태 관리 ====
                                
                1. 근태 입력 (option)
                2. 근태 수정 *
                3. 근태 삭제 *
                4. 직원별 월별 근태 현황 보기 (option)
                5. 부서별 월별 근태 현황 보기 *
                0. 메인 메뉴로 돌아가기 *
                                
                선택하세요:\s""");

        return scanner.nextLine();
    }

    // ==== 근태 입력 ====  (선택 사항)
    public Employee inputEmployee() {

        return null;
    }

    // ==== 근태 수정 ====
    public AttendanceInputDto updateAttendance() {
        System.out.print("\n변경할 근무자 ID 입력 [EX: emp_01]: ");
        String id = scanner.nextLine();

        System.out.print("변경할 근무 날짜 입력 (YYYY-MM-DD): [EX: 2024-08-01] : ");
        String date = scanner.nextLine();

        System.out.print("변경 할 근태 입력 (출근/퇴근/휴가 등): [EX: 출근] : ");
        String statusCode = Attendance.getStatusCode(scanner.nextLine());

        return new AttendanceInputDto(id, date, statusCode);
    }

    // ==== 근태 삭제 ====
    public AttendanceInputDto deleteAttendance() {
        System.out.print("\n삭제할 근무자 ID 입력 [EX: emp_01] : ");
        String id = scanner.nextLine();

        System.out.print("삭제할 근무 날짜 입력 (YYYY-MM-DD): [EX: 2024-08-01] : ");
        String date = scanner.nextLine();

        return new AttendanceInputDto(id, date);
    }

    // ==== 직원별 월별 근태 현황 ==== (선택사항)
    public void attendanceByEmployeeAndMonth() {


    }

    // ==== 부서별 월별 근태 현황 ====
    public void attendanceByDepartmentAndMonth() {


    }

    public void exit() {
        System.out.println("프로그램을 종료합니다.");
    }

    public void inDevelopment() {
        System.out.println("개발중입니다.");
    }

    public void wrongInput() {
        System.out.println("잘못된 입력입니다.");
    }

    public void printResult(boolean result) {
        System.out.println((result) ? "적용되었습니다." : "변경된 사항이 없습니다.");
    }
}
