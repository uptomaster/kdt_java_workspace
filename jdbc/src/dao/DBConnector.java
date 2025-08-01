package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBConnector {
	public static Connection getConnection() {
		Connection connection = null;
		// 연결에 필요한 정보들
		String userName = "kdt1";
		String password = "1234";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		
		// jdbc url구글링하면 나온다.
		// url은 주소를 어디로 전달하는지를 의미하며
		// 반드시 url을 정확하게 작성해야한다.
		
		try {
		// 오라클 드라이버를 불러오기위해서
		Class.forName("oracle.jdbc.driver.OracleDriver");
		// 위의 19라인이 문제가 없으면 (드라이버에 제대로 올라가면)
		// getConnection객체에 정보를 알려준다.(userName, password, url 정보를 알려준다.)
		connection = DriverManager.getConnection(url, userName, password);
		// SQLException은 연결정보가 잘못되었을때 연결정보예외가 발생한다.
		System.out.println("연결성공");
		}catch(ClassNotFoundException e) {
			System.out.println("드라이버 로딩 실패");
			e.printStackTrace();
		} catch (SQLException e) {
			System.out.println("연결 정보 오류");
			e.printStackTrace();
		}
		return connection;
	}
}
