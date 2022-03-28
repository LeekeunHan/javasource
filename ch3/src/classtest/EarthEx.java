//package : 폴더 이다 , 관련있는 것들의 모임  
package classtest;


// java.util : 패키지명
// import java.util.Scanner : Scnnar라는 클래스는 java.util.scanner 에 있는 클래스야  
import java.util.Scanner;

public class EarthEx {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner (System.in);
		
		System.out.println("반지름 : "+Earth.EARTH_RADIUS+"km");
		System.out.println("지구의 표면적 : "+Earth.EARTH_SURFACE_AREA+"km^2");

	}

}
