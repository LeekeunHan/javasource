package condition;

import java.util.Scanner;

public class PayOfHours {

	public static void main(String[] args) {
		// 사용자로부터 근무시간을 입력받기 
		// 근무시간 중 8시간 까지는 시간당 9800원 지급 
		// 8시간을 초과하는 근무시간은 시간당 급여의 1.5 배를 지급 
		
		Scanner sc= new Scanner(System.in);
		System.out.println("근무시간 : ");
		int hours = sc.nextInt();
		
		int pay = 0 , rate= 9800;
		
		if(hours > 8) {
			pay = (int)((hours-8)*1.5*rate)+8 * rate;
		}else {
			pay = rate * hours; //1시간당 9800원 급여 지금
		}
		System.out.println("하루 임금은 : "+pay+ "원이다");
		
		
		
	}

}
