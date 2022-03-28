package api;

public class MemberEx {

	public static void main(String[] args) {
		// Member 객체 생성 => Member클래스를 불러온다 
		Member member1= new Member("blue");	//id
		Member member2= new Member("blue");	//id
		Member member3= new Member("red");	//id
		
		System.out.println(member1.equals(member2));
		System.out.println(member1.equals(member3));
		
		System.out.println(member1);	// 원래는 주소값이 나오게된다  
		System.out.println(member2);	// 따라서 tostring()을 불러내야한다 
		System.out.println(member3);	// 즉 , tostring 오버라이딩을통해 문자열을 불러야한다
	}

}
