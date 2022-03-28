package shop;

public class User { 
	// User class
	private String name;	//고객명
	private payType paytype;		//결재방법
	
	//생성자 생성 
	public User(String name, payType paytype) {
		super();
		this.name = name;
		this.paytype = paytype;
	}

	

	//geter 생성 
	public String getName() {
		return name;
	}

	public payType getPaytype() {
		return paytype;
	}

	
	
	
	

}
