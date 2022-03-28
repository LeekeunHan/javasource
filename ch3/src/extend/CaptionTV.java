package extend;

public class CaptionTV extends TV{
	
//		String color;
//		boolean power;
//		int channel;
		
		//캡션기능
		boolean caption;
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
