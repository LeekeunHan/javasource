package exam;

public class IPTV extends ColorTV{
	
	String ip;
	
	public IPTV(String ip , int size, int result) {
		super(size, result);
		this.ip=ip;
		// TODO Auto-generated constructor stub
	}

	public void printproperty() {
		System.out.print("나의 IPTV 는 "+ip+"주소의");
		super.printproperty();
	}
	

	
	 
}
