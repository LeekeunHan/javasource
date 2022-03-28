package condition;

public class ForEx3 {

	public static void main(String[] args) {
		
		//1~10 까지 합 
		int sum=0;		//1~10 까지 합을 넣어줄 변수 선언 
		
		for (int i=1; i<11; i++) {
			sum += i; //sum= sum + i 
			
		}
		//System.out.println(i); 못쓰는이유? 
		//: for문 스코프({})안에서 돌아야하는데 바깥에 나와있는 스코프에서는 선언이 되어 있지않아서 사용할수 없다 		
		System.out.println("1~10까지의 합 :"+sum);
		
		
		
		//1~100까지의 합 
		sum = 0;
		for(int j=1; j<101; j++) {
			sum+=j;
		}
		System.out.println("1~100까지의합 : "+sum);

		
		
		
	}

}
