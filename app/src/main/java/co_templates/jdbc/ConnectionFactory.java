package co_templates.jdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

// JDBC, MySQL 연결 인스턴스 생성 클래스
public class ConnectionFactory {
    static final String DB_URL = "jdbc:mysql://192.168.0.94:3307/db_hr";   // container name
    static final String USER = "cocolabhub";
    static final String PASS = "cocolabhub2024";

    public static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(DB_URL, USER, PASS);
    }
}
