package condition;

import java.util.Scanner;

public class BreakContinueEx {

	public static void main(String[] args) {
		int menu = 0;
		Scanner sc = new Scanner (System.in);
		
		while (true) {
			System.out.println("(1) square");
			System.out.println("(2) square root");
			System.out.println("(3) log");
			System.out.println("원하는 메뉴(1 ~ 3)를 선택해 주세요(종료:0)");
			
//			String num = sc.nextLine();
//			menu =Integer.parseInt(num);
			menu =sc.nextInt();
			
			if (menu==0) {		// 0번 일때는 break문을 이용해 빠져나간다 
				System.out.println("프로그램 종료");
				break;
			}else if(!(1<=menu && menu<=3)) {	//1~3번 숫자가 아닌 다른숫자가 들어올경우 syso문 출력된다
				System.out.println("메뉴를 잘못 선택했습니다.(종료는0)"); //0이면 종료된다 
				continue;
			}
			System.out.printf("선택하신 메뉴는 %d 입니다\n",menu); 
		}
		
	}

}
