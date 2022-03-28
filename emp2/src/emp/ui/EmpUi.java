package emp.ui;

import java.util.Scanner;

import emp.action.Action;
import emp.action.EmpAddAction;
import emp.action.EmpListAction;
import emp.action.EmpModifyAction;
import emp.action.EmpRemoveAction;
import emp.action.EmpRowAction;
import emp.controller.EmpController;



public class EmpUi {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		boolean flag = true ; 
		EmpController empController = new EmpController();
		
		while (flag) {
			System.out.println("==========================");
			System.out.println("1. Emp 전체 조회");
			System.out.println("2. Emp 사원 조회");
			System.out.println("3. Emp 사원 정보 수정");
			System.out.println("4. Emp 사원 탈퇴");
			System.out.println("5. Emp 사원 추가");
			System.out.println("6. 종료");
			System.out.println("==========================");
			System.out.println();
			
			System.out.println("메뉴 선택 >>");
			int no = Integer.parseInt(sc.nextLine());
			
			
			Action action = null;
			
			
			switch (no) {
			case 1:
				action = new EmpListAction();
				break;
				
			case 2:
				action = new EmpRowAction();
				break;
				
			case 3:
				action = new EmpModifyAction();
				break;
				
			case 4:
				action = new EmpRemoveAction();
				break;
				
			case 5:
				action = new EmpAddAction();	//EmpAddAction 객체생성(사용하겠다) 
				break;
				
			case 6:
				flag= false;
				break;	

			default:
				break;
			} //switch 종료 
			
			if(action!=null) {
				empController.processRequest(action, sc); //empController.processRequest을 호출한다
															//5번을 누르면 empAddAction 이 들어간다 
			}
			
		}// while 종료 

	}

}
