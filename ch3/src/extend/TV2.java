package extend;

 
//CaptionTV : TV + caption 

public class TV2 {
	//속성 : 색상(black) , 전원상태(on/off) , 채널 .....
	private String color;
	private boolean power;
	private int channel;
	
//	//생성자 
	public TV2(String color, boolean power, int channel) {
		super();	//object 호출 
		this.color = color;
		this.power = power;
		this.channel = channel;
	}
	
	//private 이라서 geter ,seter 생성 
	public String getColor() {
		return color;
	}
	public void setColor(String color) {
		this.color = color;
	}
	public boolean isPower() {
		return power;
	}
	public void setPower(boolean power) {
		this.power = power;
	}
	public int getChannel() {
		return channel;
	}
	public void setChannel(int channel) {
		this.channel = channel;
	}
	
	
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
