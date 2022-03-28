package extend;

public class CaptionTV2 extends TV2{
	
//		String color;
//		boolean power;
//		int channel;
	
	


	//캡션기능
	boolean caption;	
	public CaptionTV2(String color, boolean power, int channel,boolean caption) {
		super(color, power, channel);	//부모의 인자를 받는 생성자 호출
		this.caption=caption;
		
	}
	
//생성자를 만들게 된다면 이런 에러코드가 뜬다 
// Implicit super constructor TV2() is undefined for default constructor. Must define an explicit constructor
	// why ? TV2 에 default 생성자가 없기 때문에 오류가 난다 
	
//	public CaptionTV2() {
//		super();	// 부모의 default 생성자 호출 
//	}
	
		
		void display(String text) {
			if(caption) {
				System.out.println(text);
			}
		}
		
//		//기능 : 전원 on/off , 채널변경 
//		void power() {	// 전원 on/off
//			power = !power;
//		}
//		void channelUp() {		//채널변경 -> 채널을 올릴때 
//			channel++;
//		}
//		void channelDown() {	//채널변경 -> 채널을 내릴때 
//			channel--;
//		}
}
