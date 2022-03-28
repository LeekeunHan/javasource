package collection;

import java.util.ArrayList;
import java.util.List;

public class ListEx2 {

	public static void main(String[] args) {
		
		List<String> list =new ArrayList<String>();
		
		list.add("java");
		list.add("jsp");
		list.add("html");
		list.add("css");
		list.add("mybatis");
		
		//System.out.println(list);
		
		for(int i=0; i<list.size();i++) { //size : length 와 같은개념
			System.out.println(list.get(i)); //get을 써서 가져온다 
		}
		
		System.out.println();
		
		for(String s:list) { //향상된 for문 
			System.out.println(s);
		}

	}

}
