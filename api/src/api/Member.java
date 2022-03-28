package api;

public class Member {

	private String id;

	//생성자 
	public Member(String id) {
		super();
		this.id = id;
	}

	@Override
	public boolean equals(Object obj) {
		// id 가 같으면  true 
		if (obj instanceof Member) { // instanceof : 객체타입 확인 연산자 
			Member member = (Member)obj; // 강제 형변환 
			
			if(id.equals(member.id)) { //id.equals -> 객체타입 String equals 을 불러낸것임 
				return true;
			}
		}
		return false;
	}
	
	

	@Override
	public String toString() {
		return "Member [id=" + id + "]";
	}
	
	
	
	
	
}
