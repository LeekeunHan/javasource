package collection;


import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class ListEx8 {

	public static void main(String[] args) {
		// Scanner 를 사용해서 5개의 실수 값을 사용자로부터 받아서 ArrayList에 저장한후 검색하여
		// 가장 큰 수 출력
		// 예시 ) 
		// 입력값 : 3.14 2.1 -5.5 99.9 33.7 
		// 출력값 : 가장 큰 수는 99.9
		Scanner sc = new Scanner (System.in);
		List<Double> list =new ArrayList<Double>();
		System.out.print("실수 입력 ");
		String input = sc.nextLine();
		
		StringTokenizer  st = new StringTokenizer(input); //기본이 공백이라서 안줘도된다
		while(st.hasMoreTokens()) {
			list.add(Double.parseDouble(st.nextToken()));
		}
		System.out.println(list);
		
		double max =0 ;
		for (Double value:list) {
			if (max < value) {
			max=value;
			}
		}
		System.out.println("가장 큰 수는 "+max);
		
		//Collections.sort() , Collection.max() 
		System.out.println("가장 큰 수는 "+Collections.max(list));

	}

}
