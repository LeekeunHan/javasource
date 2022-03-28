package arrey;

public class ArreyEx3 {

	public static void main(String[] args) {
		//score 배열명으로 5개의 int 값 생성
		//int score[] = {0,10,20,30,40};
		
		int score[] =new int[5];
		
		
		// length : 배열의 길이를 가져와서 쓸수 있음 new int[5] 라서 0,1,2,3,4 값을 가져올수있음 
		for (int i=0; i<score.length; i++) {	
			score[i] = i*10;
		}
		
		
		
		for(int i=0; i<score.length; i++) {
			System.out.println(score[i]);
		}
		
		
		
		int score2[]= {48,78,25,65,36,79};
		int sum =0;
		// score2 의 평균과 합계
		for(int i=0; i<score2.length; i++) {
			sum += score2[i];
		}
		System.out.println("score2 합계 : "+sum);
		System.out.println("score2 합계 : "+sum/score2.length);
		
		
		
	}

}
