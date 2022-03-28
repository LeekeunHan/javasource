package condition;

import java.util.Scanner;

public class ScannerEx2 {

	public static void main(String[] args) {
		
		Scanner sc =new Scanner (System.in);
		
		System.out.print("첫 번째 수 입력 >> ");
		//int num1 = sc.nextInt();

		//"25" => 25 / 문자로 인식되는것을 숫자로 바꿔준다 
		int num1 = Integer.parseInt(sc.nextLine());	//25 => "25" // 매우중요!!!★
		//sc.nextLine() 을통해 입력받은 문자열을 숫자(정수) 로 바꾸어준다 
		
		
		
		
		System.out.print("두 번째 수 입력 >> ");
		//int num2 = sc.nextInt();	
		
		//Integer.parseInt("35"); //35 => "35"
		int num2 = Integer.parseInt(sc.nextLine()); //35 => "35"
		
		
		
		
		
		
		System.out.print("사칙연산(+,-,*,/,%) 중 하나 입력 >> ");
		String op =sc.nextLine();
		
		
		
		
		// + : 연결(문자열) , +: 덧셈 
		int result =0;
		
		switch (op) {
		case "+":
			result =num1 + num2;
			break;
		case "-":
			result = num1 -num2;
			break;
		case "*":
			result = num1 *num2;
			break;
		case "/":
			result = num1 /num2;
			break;
		case "%":
			result = num1 %num2;
			break;
			
		}
		System.out.printf("(%d %s %d = %d )",num1 , op, num2, result);
		 
	}

}
