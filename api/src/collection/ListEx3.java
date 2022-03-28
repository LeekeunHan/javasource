package collection;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		
		list.add(5);
		list.add(4);
		list.add(2);
		list.add(0);
		list.add(1);
		list.add(3);
		
		System.out.println(list);
		
		//정렬 => Arrays.sort() : 배열  , collections.sort : 정렬기능
		Collections.sort(list);		 
		System.out.println(list);
		
		//삭제 
		for(int i =list.size()-1;i>=0;i--) { //끝에서부터 삭제 
			if(list.contains(list.get(i))) { //i값을 가져와서(get) 
											 //담겨져있으면(contains)
			list.remove(i);	//삭제하겠다 (remove) 
			}
			
		}

	}

}
