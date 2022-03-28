package collection;

import java.util.HashSet;
import java.util.Set;

/*
 * Set
 * 순서가 없음
 * 중복 허용 안함 
 * 
 * HashSet , TreeSet 
 * */

public class SetEx1 {

	public static void main(String[] args) {
		
		Set<String> set = new HashSet<String>();
		
		// 순서 없이 저장 
		set.add("java");
		set.add("jsp");
		set.add("jdk");
		set.add("Servlet");
		set.add("Oracle");
		set.add("Oracle"); //중복이 허용이 안됨! 

		System.out.println(set);
	}

}
