package op;

import java.util.Scanner;

public class ConditionalOperatorEx2 {

	public static void main(String[] args) {
		// 숫자를 입력받고 그 숫자가 양수 , 음수 인지 출력
		
		Scanner sc = new Scanner(System.in);
		System.out.println("숫자를 입력하시오");
		int num = sc.nextInt();
		
		System.out.println(num > 0 ? "양수" : "음수");
		
		
		sc.close();

	}

}