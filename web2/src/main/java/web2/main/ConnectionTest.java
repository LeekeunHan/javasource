package web2.main;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionTest {

	public static void main(String[] args) {
		// JDBC (자바와 데이터베이스 연결 규칙) 
		
		//1) 드라이버로드 
		//2) 드라이버를 통해서 DB와 연결 
		//3) SQL문 전송 => 서버에서 SQL문을 파싱하고 실행계획을 세움  
		//4) SQL문 실행 
		//5) 실행결과 받기 

		Connection con=null;
		
		try {
			//드라이버 로드
			Class.forName("oracle.jdbc.OracleDriver");
			//DB연결을 위한 문자열 생성 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user="javadb";
			String password ="12345";
			//드라이버 매니저를 통해 연결 시도
			con = DriverManager.getConnection(url,user,password);
			
			
			
			if(con!=null) {
				System.out.println("연결되었습니다.");
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
	}

}
