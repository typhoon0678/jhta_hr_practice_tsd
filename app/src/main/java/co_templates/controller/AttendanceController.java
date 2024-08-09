package co_templates.controller;

import co_templates.dto.AttByDepDto;
import co_templates.dto.AttendanceInputDto;
import co_templates.repository.AttendanceRepository;
import co_templates.service.EmpDailyRecordsService;
import co_templates.service.EmpQueryService;
import co_templates.view.HRView;

import java.util.List;

// 근태 관리 컨트롤러
public class AttendanceController {

    private final AttendanceRepository attendanceRepository;
    private final EmpDailyRecordsService empDailyRecordsService;
    private final EmpQueryService empQueryService;
    private final HRView hrView;

    public AttendanceController(
            AttendanceRepository attendanceRepository,
            EmpDailyRecordsService empDailyRecordsService,
            EmpQueryService empQueryService,
            HRView hrView) {
        this.attendanceRepository = attendanceRepository;
        this.empDailyRecordsService = empDailyRecordsService;
        this.empQueryService = empQueryService;
        this.hrView = hrView;
    }

    // 프로그램 실행 (인적 자원 관리 시스템 Controller)
    public void run() {

        String menu = "";

        // while 문으로 프로그램 실행 로직 작성
        while (!menu.equals("0")) {

            menu = hrView.selectSystemOption();

            switch (menu) {
                case "3":
                    handleAttendance();
                    break;
                case "1", "2", "4", "5", "6", "7", "8", "9", "10":
                    hrView.inDevelopment(); // 개발 중
                    break;
                case "0":
                    hrView.exit();
                    break;
                default:
                    hrView.wrongInput();
                    break;
            }
        }
    }

    // 근태 관리 Controller
    public void handleAttendance() {

        String input = "";

        while (!input.equals("0")) {

            input = hrView.selectAttendanceOption();

            switch (input) {
                case "2":
                    updateAttendance();
                    break;
                case "3":
                    deleteAttendance();
                    break;
                case "5":
                    attendanceByDepartmentAndMonth();
                    break;
                case "6":
                    testAttendance();
                    break;
                case "1", "4":
                    hrView.inDevelopment();
                    break;
                case "0":
                    break;
                default:
                    hrView.wrongInput();
                    break;
            }

        }
    }

    // 근태 입력 Controller (선택 사항)
    public void insertAttendance() {

        // attendanceRepository.addAttendance();
    }

    // 근태 수정 Controller
    public void updateAttendance() {
        AttendanceInputDto updateAttendance = hrView.updateAttendance();

        boolean result = attendanceRepository.updateAttendance(updateAttendance);

        hrView.printResult(result);
    }

    // 근태 삭제 Controller
    public void deleteAttendance() {
        AttendanceInputDto deleteAttendance = hrView.deleteAttendance();

        boolean result = attendanceRepository.deleteAttendance(deleteAttendance);

        hrView.printResult(result);
    }

    // 직원별 월별 근태 현황 Controller (선택 사항)
    public void attendanceByEmployeeAndMonth() {


    }

    // 부서별 월별 근태 현황 Controller
    public void attendanceByDepartmentAndMonth() {

        empDailyRecordsService.getAttSummary();
    }

    // Test 부서별 월별 근태 현황 Controller
    public void testAttendance() {
        List<AttByDepDto> attByDepDtoList = empQueryService.getAttendanceByDep();

        hrView.testAttendanceByDepartmentAndMonth(attByDepDtoList);
    }
}
