package classtest;

public class Card {
	
	//멤버변수 (인스턴스 변수)
	String kind;
	int number;
	
	//클래스변수 = 공유 / 공통적인속성이 있는경우 static 으로 만들면 편하다  
	static int width =100;
	static int height =150;
	
	//생성자
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	
	
}
