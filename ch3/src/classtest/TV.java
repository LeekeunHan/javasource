package classtest;

// 클래스 : 객체의 속성과 기능을 코드로 구현 


public class TV {
	//속성 : 색상(black) , 전원상태(on/off) , 채널 .....
	String color;
	boolean power;
	int channel;
	
	//생성자를 명시하지않으면 컴파일러가 자동으로 default 생성자를 만들어줌 
	
	//기능 : 전원 on/off , 채널변경 
	void power() {	// 전원 on/off
		power = !power;
	}
	void channelUp() {		//채널변경 -> 채널을 올릴때 
		channel++;
	}
	void channelDown() {	//채널변경 -> 채널을 내릴때 
		channel--;
	}
	
}
