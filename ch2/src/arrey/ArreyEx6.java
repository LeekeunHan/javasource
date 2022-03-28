package arrey;

public class ArreyEx6 {

	public static void main(String[] args) {
		// 10명의 점수를 배열로 생성 
		// 최대값 , 최소값 
		
		
	
		int score[]= {55,66,75,85,48,46,45,35,24,68};
		int max = score[0];
		int min = score[0];
		
		for(int i=1; i<score.length; i++ ) {
			if(max<score[i]) {
				max=score[i];
			}
			
		}
		System.out.println("최대점수 : "+max);
		
		
		
		
		for (int i=1; i<score.length; i++) {
			if(min>score[i]) {
				min=score[i];
			}
		}
		System.out.println("최소점수 : "+min);
		
		
		
		
	}

}
