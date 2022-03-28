package condition;

public class ForEx8 {

	public static void main(String[] args) {
		// *
		// * * 
		// * * *
		// * * * * 
		// * * * * *
		
		
		for (int i=1; i<=5; i++) {
			
			for(int j=1; j<=i; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
		
		System.out.println();
		
		
	//					*
	// 				*	*
	//			*	*	*	
	//		*	*	*	*
	//	*	*	*	*	*	
		
		for(int i=1; i<=5; i++) {	// 5줄생성 
			for (int j=5; j>=1; j--) {
	//			System.out.print(j<=i?"*":" ");
				if(j<=i) {			
					System.out.print("*");
				}else {
					System.out.print(" ");
				}
			}
			System.out.println();
		}
		
		
		
		
	}

}
