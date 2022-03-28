package condition;

import java.util.Scanner;

public class DoWhileEx2 {

	public static void main(String[] args) {
		// q가 입력되기 전까지 문자를 입력받기 
		
		Scanner sc= new Scanner (System.in);
		//sc.nextInt() : 숫자
		//nextLine : 키보드에서 들어올수 있는 모든것들 (숫자,문자 등등등등) 
//		String msg = sc.nextLine(); 
//		
//		System.out.println(msg);
		
		
		System.out.println("메시지 입력해 주세요");
		System.out.println("종료를 원하면 q입력해 주세요");
		
		String msg = "";	//"" : 초기화를 default 값으로 주었다 
		
		do {
			System.out.println(">>");
			
			msg =sc.nextLine();
			System.out.println(msg);
			
		}while(!msg.equals("q"));
		
		System.out.println("\n 프로그램종료");
	}

}
