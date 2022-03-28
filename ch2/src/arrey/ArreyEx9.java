package arrey;

public class ArreyEx9 {

	public static void main(String[] args) {
		// 이차원배열 
		int scores[][] =new int[3][3];
		
		//1행 
		scores[0][0] =10;
		scores[0][1] =20;
		scores[0][2] =30;
		
		//2행 
		scores[1][0] =40;
		scores[1][1] =50;
		scores[1][2] =60;
		
		//3행 
		scores[2][0] =70;
		scores[2][1] =80;
		scores[2][2] =90;

		
		for(int i=0; i<scores.length;i++) {		//행의 길이 
			for (int j=0; j<scores[i].length; j++) {	// 열의 길이 
				System.out.print(scores[i][j]+" ");
			}
			System.out.println();
		}
		
		System.out.println();
		
		// 향상된 for문 
		for(int score[]:scores){
			for(int j:score) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		
		
		
		
	}

}
