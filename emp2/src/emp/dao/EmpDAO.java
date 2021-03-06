package emp.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import emp.dto.EmpDTO;

import static emp.dao.JdbcUtil.*; // static JdbcUtil 모두를 불러온다 

//CRUD 메소드 
public class EmpDAO {

	private Connection con;				//DB 접속
		
	public EmpDAO(Connection con) {
		super();
		this.con = con;
	}

	
	
	//전제조회
	public List<EmpDTO> getList() {
		
		
		List<EmpDTO> list = new ArrayList<EmpDTO>();
		PreparedStatement pstmt = null; //sql 전송
		ResultSet rs = null;	//결과를 받아올때 
		
		
		String  sql = "select * from exam_emp";
		
		try {
			pstmt = con.prepareStatement(sql); //sql문 서버로 전송
			
			rs= pstmt.executeQuery();	//실행 
			
			//rs 에 담긴 sql 실행 결과를 List 담아서 리턴 
			while(rs.next()) {
				//첫번째 행의 각 컬럼들을 가져와서 EmpDTO 객체로 만들어줌 
				int empno = rs.getInt("empno");
				String enmae = rs.getString("ename");
				String job = rs.getNString("job");
				int mgr = rs.getInt("mgr");
				Date hiredate= rs.getDate("hiredate");
				int sal = rs.getInt("sal");
				int comm = rs.getInt("comm");
				int deptno = rs.getInt("deptno");
				EmpDTO dto = new EmpDTO(empno, enmae, job, mgr, hiredate, sal, comm, deptno);
			
				//List 추가 
				list.add(dto);
			}
			
			
			
		} catch (SQLException e) {
			e.printStackTrace();
		}finally {
			close(rs);
			close(pstmt);
		}
		return list;
	}
	
	// 사원조회 
	public EmpDTO getRow(int empno) {
		
		EmpDTO dto = null;
		PreparedStatement pstmt = null; //sql 전송
		ResultSet rs = null;	//결과를 받아올때 
		
		String sql = "select empno, ename,job,hiredate,deptno from exam_emp where empno=?";
		try {
			
			pstmt = con.prepareStatement(sql); 
			// ? 대한 처리 
			pstmt.setInt(1,empno);		//1 : 첫번째 나오는 물음표(?) 에 empno를 넣을것이다 
			
			rs = pstmt.executeQuery();	
			
			if(rs.next()) {	//행 하나만 나온상태 
//				empno = rs.getInt("empno");
//				String ename = rs.getString("ename");
//				String job = rs.getNString("job");
//				Date hiredate= rs.getDate("hiredate");
//				int deptno = rs.getInt("deptno");
//				dto = new EmpDTO(empno, enmae, job, hiredate, deptno);
				
				dto = new EmpDTO();
				dto.setEmpno(rs.getInt("empno"));
				dto.setEname(rs.getString("ename"));
				dto.setJob(rs.getNString("job"));
				dto.setHiredate(rs.getDate("hiredate"));
				dto.setDeptno( rs.getInt("deptno"));
				
				
				
			
			}
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(rs);
			close(pstmt);
		}
		return dto;
	}
	
	//정보 수정 
	public boolean update(int empno , int mgr) {
		
		PreparedStatement pstmt = null; //sql 전송
		
		String sql = "update exam_emp set mgr = ? where empno= ?";
		
		try {
			
		
			pstmt =con.prepareStatement(sql);
			pstmt.setInt(1, mgr);
			pstmt.setInt(2, empno);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
			
			
			
			
		} catch (Exception e) {
			e.printStackTrace();
		}finally {
			close(pstmt);
			
		}
		return false;
	}
	
	
	//삭제 
	public boolean delete(int empno) {
		
		PreparedStatement pstmt = null; //sql 전송
	 
		String sql = "delete from exam_emp where empno=?";
		try {
			
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, empno);
			int result = pstmt.executeUpdate();
			
			if(result>0) {
				return true;
			}
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			close(pstmt);
			
			
		}
		return false;
	}
	
	//추가
	//방법 1
//	public boolean insert(int empno, String ename , String job , int mgr , int sal, int comm, int deptno) {
//		
//		String sql = "insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
//		sql+= "values (?,?,?,?,sysdate,?,?,?)";
//		
//		try {
//			
//			con=getConnection();
//			pstmt = con.prepareStatement(sql);
//			pstmt.setInt(1, empno);
//			pstmt.setString(2, ename);
//			pstmt.setString(3, job);
//			pstmt.setInt(4, mgr);
//			pstmt.setInt(5, sal);
//			pstmt.setInt(6, comm);
//			pstmt.setInt(7, deptno);
//			
//			int result = pstmt.executeUpdate();
//			if(result>0) {
//				return true;
//			}
//			
//		} catch (Exception e) {
//				e.printStackTrace();
//		} finally {
//			try {
//				pstmt.close();
//				con.close();
//			} catch (Exception e2) {
//				e2.printStackTrace();
//			}
//		}
//		return false;
//	}
	
	//방법 2 
	public boolean insert(EmpDTO insertDto) {
		
		PreparedStatement pstmt = null; //sql 전송
		 
		
		String sql = "insert into exam_emp(empno,ename,job,mgr,hiredate,sal,comm,deptno) ";
		sql+= "values (?,?,?,?,sysdate,?,?,?)";
		
		try {
			
			
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, insertDto.getEmpno());
			pstmt.setString(2, insertDto.getEname());
			pstmt.setString(3, insertDto.getJob());
			pstmt.setInt(4, insertDto.getMgr());
			pstmt.setInt(5, insertDto.getSal());
			pstmt.setInt(6, insertDto.getComm());
			pstmt.setInt(7, insertDto.getDeptno());
			
			int result = pstmt.executeUpdate();
			if(result>0) {
				return true;
			}
			
		} catch (Exception e) {
				e.printStackTrace();
		} finally {
			close(pstmt);
			
		}
		return false;
	}
	
	
	
	
	
	
	
}













