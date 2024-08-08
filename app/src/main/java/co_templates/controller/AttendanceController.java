package co_templates.controller;

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

    // 프로그램 실행
    public void run() {

        // while 문으로 프로그램 실행 로직 작성
    }


}
