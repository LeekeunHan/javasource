package condition;

import java.util.Scanner;

public class MinValue {

	public static void main(String[] args) {
		// 3개의 정수를 입력받아 가장 작은수 출력 
		// num1 = 35 , num2 = 25 , num3 = 55
		
		
		Scanner sc=new Scanner (System.in);
		
		System.out.println("num1 :");
		int num1 = sc.nextInt();
		System.out.println("num2 :");
		int num2 = sc.nextInt();
		System.out.println("num3 :");
		int num3 = sc.nextInt();
		
		//제일 작은 수
		int min = num1; 	// 제일 작은값을 넣어줄 빈 칸을 하나 만든다 
		if(min > num2) {
			min = num2;
		}
		if(min > num3) {
			min = num3;
		}
		System.out.println("가장작은수 : "+min);
		
		//제일 큰수 
		int max = num1;		// 제일 큰 값을 넣어줄 빈 칸을 하나 만든다 
		if(max < num2) {
			max = num2;
		}
		if (max < num3) {
			max = num3;
		}
		System.out.println("가장큰수 : "+max);
				
		
		sc.close();
		
		
		
	}

}
