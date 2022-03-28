package arrey;

import java.util.Arrays;

public class ArreyEx7 {

	public static void main(String[] args) {
		// 1~45번을 가지고 있는 카드 생성 
		// 서로 섞은후 출력 
		
		int card[] =new int[45];
		
		for (int i=0; i<card.length; i++) {
			card[i] = i+1;
		}
		System.out.println(Arrays.toString(card));
		
		
		
		
		
		
		for (int j=0; j<card.length; j++) {// 0 ~ 44 
			int pos =(int)(Math.random()*45);	//15번째 카드 
			
			int temp=card[j] ; //첫번째 카드를 빈temp에다가 옮기기
			card[j]= card[pos]; // 15번자리에 있는 카드를 0번자리에 갖다 넣기 
			card[pos]= temp;	//첫번째 자리의 카드를 15번째 카드에다가 넣기 
		}
		System.out.println(Arrays.toString(card));
		
		
		
//		int a= 10 , b=5;
//		// a,b 의 값을 교환 
//		int c= 0; //c를 생성한다 
//		c=a;
//		a=b;
//		b=c;
		
		
	}

}
