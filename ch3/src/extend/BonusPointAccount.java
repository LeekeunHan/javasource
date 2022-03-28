package extend;

public class BonusPointAccount extends Account {

	// 보너스 포인트 
	private int bonusPoint;
	
	public BonusPointAccount(String accountNo, String owner, int balance , int bonusPoint) {
		super(accountNo, owner, balance);
		this.bonusPoint=bonusPoint;
		// TODO Auto-generated constructor stub
	}
	
	
	
	@Override
	int deposit(int amount) {
		//예금 --> Account 부모의 예금(deposit)을 가져온다 
		super.deposit(amount);
		//보너스포인트 = 예금액 * 0.1%  --> 추가기능 넣기 
		bonusPoint += (int)(amount*0.001);
		return bonusPoint;
	}
	
	// Geter 메소드 생성 
	public int getBonusPoint() {
		return bonusPoint;
	}
	
	
	
	
}
