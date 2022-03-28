package op;

import java.util.Scanner;

public class Salary {

	public static void main(String[] args) {
		//사용자로부터 한달 월급을 입력받은후 	
		Scanner sc=new Scanner(System.in); //키보드에 입력을받고
		System.out.println("한달 월급 입력");
		int salary = sc.nextInt();	//사용자에게 입력을 받을것이다 
		
		
		//한달 월급을 10년동안 저축했을때 금액 
		int deposit =salary * 12 * 10;
		System.out.println("10년 저축 금액 "+deposit);
		
		sc.close();
		
		
		
	}

}
