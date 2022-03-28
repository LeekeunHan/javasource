package extend;

public class CaptionTVEx1 {

	public static void main(String[] args) {
		CaptionTV ctv = new CaptionTV();
		
		ctv.channel=10;
		ctv.channelUp();
		System.out.println("현재채널 : "+ctv.channel);
		
		ctv.display("hello world");	// false 상태이기때문에 안나온다
		ctv.caption=true;			// true 로 바꾸면
		ctv.display("hello world");	// 이결과문이 나오게된다 
		
		
		
		
		
		
		
		
		CaptionTV2 ctv2 = new CaptionTV2("black",true,7,true);
		
		ctv2.setChannel(11);
		ctv2.channelUp();
		System.out.println("현재채널 "+ctv2.getChannel());

	}

}
