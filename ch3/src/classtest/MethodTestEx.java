package classtest;

import java.util.Arrays;

public class MethodTestEx {

	public static void main(String[] args) {
		
		System.out.println(args[0]);
		System.out.println(args[1]);
		
		
		
		
		MethodTest1 obj = new MethodTest1();
		
		//sum 호출 
		System.out.println(obj.sum(4, 6));
		
		//method1 호출
		char charValue=obj.method1();

		int value = charValue+1;
		System.out.println(value);
		
		//divide1 호출
		float result1 = obj.divide1(5.0f, 2.0f);
		System.out.println(result1);
		
		// array 호출 
		int arr[]= {4,5,6,7};
		
		int arr2[]=obj.array(arr);
		System.out.println(Arrays.toString(arr2));
	}

}
