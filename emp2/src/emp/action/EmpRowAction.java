package emp.action;

import java.util.Scanner;

import emp.dto.EmpDTO;
import emp.service.EmpRowSerivce;
import emp.util.ConsoleUtil;

//2번 
public class EmpRowAction implements Action {

	@Override
	public void execute(Scanner sc) throws Exception {
		//service 호출 
		EmpRowSerivce service = new EmpRowSerivce();
		
		ConsoleUtil util = new ConsoleUtil();
		int empno = util.printRowMessage(sc);
		EmpDTO dto =service.getRow(empno);
		
		//출력
		util.printEmpMessage(dto);
	}

}
