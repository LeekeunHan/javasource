package shop;


//product 를 불러서 사용 가능하다 
public class CellPhone extends Product {

	private String carrier;		//통신사 
	
	
	//생성자 맞춰주기 
	public CellPhone(String name, int price ,String carrier) {
		super(name, price);
		this.carrier=carrier;
		
	}

	@Override
	public void printExtra() {
		System.out.println("통신사 정보 : "+carrier);

	}

}
