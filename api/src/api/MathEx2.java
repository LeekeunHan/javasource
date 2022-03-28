package api;

// 정적 import : 내가직접 static 으로 끌어올려서 Math을 만듬 
// 가지고있는 메소드가 static 로 되어있어야 끌어올릴수있다 그럼앞쪽의 Math을빼고 사용할수 있다  
import static java.lang.Math.*;


public class MathEx2 {

	public static void main(String[] args) {
		double val = 90.7552;
		
		System.out.println("반올림 : "+round(val));
		System.out.println("올림 : "+ceil(val));
		System.out.println("버림 : "+floor(val));
		
		System.out.println(Math.PI);

	}

}
