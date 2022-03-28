package op;

// 증감연산자 (++ , --)
// ++ : +1씩 증가 
// -- : -1씩 감소 


public class IncreaseDecreaseOperEx {

	public static void main(String[] args) {
		int i = 10;
		
		++i;	// i = i + 1 	// 증가되고 증가후의 값 출력  
		System.out.println("i = "+i);
		
		i++;	// i = i + 1	// 증가되고 증가전의 값 출력 
		System.out.println("i = "+i);
		
		--i;	// i = i - 1
		System.out.println("i = "+i);
		
		i--;	// i = i - 1
		System.out.println("i = "+i);
		
		
	}

}
