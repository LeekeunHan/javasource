package kh;



public class QuestionEx {

	public static void main(String[] args) {
		Question question = new Question("이근한" , "ii9139" , "12345!@"); 
		question.changepassword("9qdaaa"); 
		Proc(question);
		
		
		
		System.out.println();
		
		
		
		Question question2 = new Question("네이마르" , "i231s39" , "145!@" , "010-8888-0000"); 
		Proc(question2);
		//System.out.println(" 이름 : "+question.name);
		//System.out.println(" 아이디 : "+question.id);
		//System.out.println(" 비밀번호 : "+question.password);
		//System.out.println(" 패스워드 : "+question.phone);
		
		
		
	}
	
	static void Proc(Question call) {
		System.out.println("아이디 : "+call.id);
		System.out.println("이름 : "+call.name);
		System.out.println("패스워드 : "+call.password);
		System.out.println("비밀번호 : "+call.phone);
		
	}

}
