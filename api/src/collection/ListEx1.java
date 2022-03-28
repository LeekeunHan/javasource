package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * List 인터페이스 
 * - 순서가 있음 
 * - 데이터 중복 허용함  
 * - 구현클래스 : ArrayList, Vector, LinkedList, Stack...
 * - 배열과 동일(향상된 버전)
 * */


public class ListEx1 {

	public static void main(String[] args) {
		

		//정수 : int => Integer
		//tostring이 오버라이딩이 되어있어서 주소값이 안나오고 바로 값이 나온다 
		List<Integer> list = new ArrayList<Integer>();
		list.add(1);
		list.add(2);
		list.add(3);
		list.add(4);
		list.add(5);
		list.add(6);
		list.add(7);
		
		System.out.println(list);
		
		
		list.add(3, 11);	//3번 자리에 11번을 넣어달라 
		System.out.println(list);
		
		System.out.println();
		
		for(int i:list) {	//향상된for문 
			System.out.println(i);
		}
		
		
	}

}
