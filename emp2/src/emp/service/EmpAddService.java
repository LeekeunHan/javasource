package emp.service;

import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

import static emp.dao.JdbcUtil.*;

import java.sql.Connection;

//5번
public class EmpAddService {

	public boolean addEmp(EmpDTO newEmp) throws Exception{
		
		boolean isAddSuccess = false; 
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean result = dao.insert(newEmp);//dao를 실제로 부르는부분
		
		// commit() , rollback() : 트랜잭션 관리 
		if(result) {
			commit(con);
			isAddSuccess =true;
		}else {
			rollback(con);
		}
		close(con);
		return isAddSuccess;
	}
	
}
