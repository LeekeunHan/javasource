package collection;

import java.util.HashSet;
import java.util.Set;

public class SetEx3 {

	public static void main(String[] args) {
		Set<Member> set = new HashSet<Member>();
		
		set.add(new Member("hong", "홍길동", "hong123"));
		set.add(new Member("kang", "강길동", "kang123"));
		set.add(new Member("park", "박길동", "park123"));
		set.add(new Member("kim", "김길동", "kim123"));
		set.add(new Member("kim", "김길동", "kim123"));
		
		//우리가만든Member클래스객체에는 Set구조임에도 중복저장이 된다 !
		//따라서 따로 Member클래스객체에서 중복 배제할수 있도록 만들어줘야한다 
		System.out.println(set);   
								
	}

}
