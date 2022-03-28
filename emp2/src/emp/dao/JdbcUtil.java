package emp.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

//여러개의 DAO 파일에서 중복된 부분 처리 

public class JdbcUtil {
	
	// static 역할 : new 안해도 사용할수 있는 상태임 
	static {
		try {
			Class.forName("oracle.jdbc.OracleDriver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	public static Connection getConnection() {
		
		Connection con = null;
		
		// DB작업 > 외부 입출력 > try-catch 필수!!!! 
		try {
			
			
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "scott";
			String password = "TIGER";
			con = DriverManager.getConnection(url,user,password);	//접속정보로 jdbc 연결 connection 생성 
			con.setAutoCommit(false); //이클립스 상에서는 결과창에서 삭제 , 삽입 등 할수잇지만 , db에서는 반영이 되지않는다
										//commit 을 false 로 해놓았기때문에 !!
		
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return con;
		
	}
	
	
	
	public static void close(Connection con) {
		try {
			con.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(PreparedStatement pstmt) {
		try {
			pstmt.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	public static void close(ResultSet rs) {
		try {
			rs.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
	
	
	
	
	public static void commit (Connection con) {
		try {
			con.commit();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	public static void rollback (Connection con) {
		try {
			con.rollback();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
}
