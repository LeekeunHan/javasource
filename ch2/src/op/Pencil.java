package op;

// 변수명 
// 소문자로 시작 ( 대소문자 구별 )  - filename , fileName 는 서로 다른 변수명 
// 두개의 단어가 붙을 경우 첫 문자를 대문자로 한다. (관례) - firstName , MaxSpeed
// $ , _ 로 시작하는것은 허용 



public class Pencil {

	public static void main(String[] args) {
		//534자루의 연필을 30명의 학생들에게 똑같은 개수로 나눌때 학생당 몇개를 가질수 있고 
		// 최종적으로 몇개가 남는지 출력하시오 
		// 변수 사용 , 산술연산자 사용 
		
		int pen = 534;
		int student = 30; 
		
		int result1 = pen / student;
		System.out.println("학생 1명당 가질수 있는 연필의 개수 = "+ result1);
		int result2 = pen % student;
		System.out.println("남는 연필의 개수 = "+result2);
	}

}
