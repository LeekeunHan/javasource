package arrey;

//배열 : 같은 타입 , 연속적으로 저장 => heap 공간에 저장(new 키워드 필요)
//		기본값으로 초기화를 해줌 (정수:0 , 실수:0.0 , boolean:false)

public class ArreyEx1 {

	public static void main(String[] args) {
		// 5개의 변수(정수타입)
		int num1 =3 , num2=4 , num3=5 , num4=6 ,num5=7;
		int num6;
		
		// The local variable num6 may not have been initialized
		// 로컬변수는 반드시 초기화가 필요하다 
		// 초기화 : = 값 ex) num =1  
		//System.out.println(num6); 	
		
		
		
		
		
		// 배열로 선언 및 생성 
		int arr[]=new int[5];	//int arr[] : 선언 new int[5]: 생성 
		System.out.println(arr);
		System.out.println(arr[1]); //index번호는 0번부터 시작 
		
		//새로운 값 저장 
		arr[0] = 78;
		arr[1]= 65;
		arr[2]= 40;
		arr[3] = 30;
		arr[4] = 20;
		
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr[3]);
		System.out.println(arr[4]);
		
		//int arr[] = {3,4,5,6,7};

	}

}
