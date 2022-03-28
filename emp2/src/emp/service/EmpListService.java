package emp.service;

import java.sql.Connection;
import java.util.List;

import static emp.dao.JdbcUtil.*;


import emp.dao.EmpDAO;
import emp.dto.EmpDTO;

// ~~Serivce : 실질적인 비즈니스 로직을 처리 

public class EmpListService {
	
	public List<EmpDTO> getEmpList(){
		
		Connection con = getConnection();	//connection 
		EmpDAO dao = new EmpDAO(con);		//dao 객체 생성 
		
		 List<EmpDTO> list=dao.getList();
		 
		 close(con);
		 
		 
		 return list;
		
	}
}
