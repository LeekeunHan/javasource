package emp.service;

import java.sql.Connection;

import static emp.dao.JdbcUtil.*;

import emp.dao.EmpDAO;

//3번 
public class EmpModifyService {
	public boolean modiftyEmp(int empno , int mgr) {
		
		boolean isModifySuccess =false;
		
		Connection con = getConnection();
		EmpDAO dao = new EmpDAO(con);
		
		boolean modifyResult = dao.update(empno, mgr);
		if(modifyResult) {
			commit(con);
			isModifySuccess=true;
		}else {
			rollback(con);
		}
		return isModifySuccess;
		
		
	}
}
