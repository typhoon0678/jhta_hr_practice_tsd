package co_templates.controller;

import co_templates.entity.Attendance;
import co_templates.repository.AttendanceRepository;
import co_templates.view.HRView;

// 근태 관리 컨트롤러
public class AttendanceController {

    private final AttendanceRepository attendanceRepository;
    private final HRView hrView;

    public AttendanceController(AttendanceRepository attendanceRepository, HRView hrView) {
        this.attendanceRepository = attendanceRepository;
        this.hrView = hrView;
    }

    // 프로그램 실행 (인적 자원 관리 시스템 Controller)
    public void run() {

        // while 문으로 프로그램 실행 로직 작성

        // hrView.selectSystemOption()
        // switch(menu) {
        // case("3"):
        // handleAttendance();
        // break; ... }
    }

    // 근태 관리 Controller
    public void handleAttendance() {

        // while 문으로 근태 관리 입력 관리

        // hrView.selectAttendanceOption();
    }

    // 근태 입력 Controller
    public void insertAttendance() {

        // attendanceRepository.addAttendance();
    }

    // 직원별 월별 근태 현황 Controller (선택 사항)
    public void attendanceByEmployeeAndMonth() {


    }

    // 부서별 월별 근태 현황 Controller
    public void attendanceByDepartmentAndMonth() {

        // 부서 검색

        // 부서 ID로 근태 LIST 검색

        // hrView로 출력
    }
}
