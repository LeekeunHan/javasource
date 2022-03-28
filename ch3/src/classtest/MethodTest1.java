package classtest;

public class MethodTest1 {
	// true , false 리턴하는 메소드 작성 =isRedirect() 
	// 인자는 없음 
	boolean isRedirect(){
		return true;	//return false;
	}
	
	// 정수 타입으로 리턴하는 메소드 작성 = sum()
	// 인자는 정수타입 2개를 입력 받음 
	// 넘어온 정수타입 2개를 더하기 한 후 결과값 리턴 
	int sum(int num1 , int num2) {
		return num1 + num2;		//int result = num1 + num2; return result;
	}
	
	// 문자 하나 리턴 , method1()
	// 인자는 없음 
	char method1() {
		return 'A';
	}
	
	// 실수 리턴(float , double) , divide1()
	// 인자는 실수 값 2개를 입력받음 
	float divide1(float num1 , float num2) {
		return num1 / num2;
	}
	
	// 실수 리턴(float , double) , divide1()
	// 인자는 실수 값 2개를 입력받음 
	double divide2(double num1 , double num2) {
			return num1 / num2;
		}
	
	// int 타입의 배열 리턴 
	// 메소드 이름 : array() : 입력받은 배열을 리턴 
	// 인자는 int 타입의 배열 
	int[] array(int arr[]) {
		arr[0]=8;
		return arr;
	}
	
	
	// 문자열 타입 리턴 
	// method2() : 인사말 리턴 
	// 인자는 없음 
	String method2(){
		return "안녕하세요";
	}
	
	
	
	
	
	
}
