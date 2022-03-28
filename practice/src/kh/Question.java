package kh;

public class Question {
	// 속성 : 이름 , 아이디 , 패스워드 , 전화번호 
	String name;
	String id;
	String password;
	String phone;
	
	
	//생성자
	public Question(String name, String id, String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		
	}
	public Question(String name, String id, String password, String phone) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
	}
	
	
	// 기능 : 비밀번호 변경
	void changepassword (String newpassword) {
		this.password=newpassword ; 
		
	}

	
}
