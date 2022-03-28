package member.service;

import java.sql.Connection;
import java.util.List;

import member.dao.MemberDAO;
import member.dto.MemberDTO;

import static member.dao.JdbcUtil.*;

public class MemberListService {
	// 비즈니스 로직 호출 (dao)
	// 전체리스트좀 보여줘바 => dao 한테 감 
	public List<MemberDTO> list(){
		
		Connection  con = getConnection();
		MemberDAO dao = new MemberDAO(con);
		
		//getList롤 호출하면 List<MemberDTO>를 넘겨준다 
		List<MemberDTO> memberList =dao.getList(); 
		
		//비즈니스 로직이 select 라면 commut() , rollback() 안함 
		
		close(con);
		
		return memberList;
	}
}
