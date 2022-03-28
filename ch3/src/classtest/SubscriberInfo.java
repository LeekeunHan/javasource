package classtest;


// 가입자 정보
public class SubscriberInfo {
	//속성 : 이름(문자,숫자8자리) , 아이디(문자,숫자8자리) , 패스워드(문자,숫자,특수문자15자리) , 전화번호(010-0000-0000) , 주소
	String name;
	String id;	//hong1234
	String password;//hong1234!@~
	String phone;
	String address;
	
	//생성자
	public SubscriberInfo() {
		super();
	}
	
	public SubscriberInfo(String name , String id , String password) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
	}
	
	public SubscriberInfo(String name, String id, String password, String phone, String address) {
		super();
		this.name = name;
		this.id = id;
		this.password = password;
		this.phone = phone;
		this.address = address;
	}
	
	
	//기능 : 비밀번호 변경 , 전화번호 변경 , 주소 변경 
	//비밀번호 변경 : 새로운 비밀번호를 입력받아 기존 비밀번호 변경 
	void changePassword(String newPassword) { //newpassword : 새로운 비밀번호 입력받기
		this.password= newPassword;
	}
	
	//전화번호 변경 : 새로운 전화번호를 입력받아 기존 전화번호 변경 
	void changephone(String newphone) {
		this.phone=newphone;
	}
	
	//주소 변경 : 새로운 주소를 입력받아 기존 주소 변경 
	void changeaddress(String newaddress) {
		this.address=newaddress;
	}
	
}
