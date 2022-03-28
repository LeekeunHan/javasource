package collection;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListEx6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> list = new ArrayList<String>();
		
		list.add("사과");
		list.add("딸기");
		list.add("바나나");
		list.add("키위");
		list.add("포도");
		
		
		//List => 배열 로 바꾸기 
		Object[] fruits=list.toArray();
		for(Object obj :fruits) {
			System.out.println(obj);
		}
		
		System.out.println();
		
		//배열 => List 으로 변경
		String f[]= {"사과","포도","멜론","수박","참외","자두","바나나"};
		List<String> list1= Arrays.asList(f);
		System.out.println(list1);
		
		// 에러발생 why ? : 배열(고정값)에서 변경하였기때문에 추가(add)를 해버리면 에러가뜸  
		//list1.add("딸기");
		
		//배열로부터 생성한 리스트의 변화가 필요할때 
		//추가를 해주고싶다면 ?! => 다시한번 객체 생성을 해서 담아야한다 
		List<String> list2= new ArrayList<String>(Arrays.asList(f));
		list2.add("딸기");
		System.out.println(list2);
		
	}

}
