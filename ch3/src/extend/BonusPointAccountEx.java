package extend;

public class BonusPointAccountEx {

	public static void main(String[] args) {
		// BonusPointAccount 객체 생성
		BonusPointAccount account1 = new BonusPointAccount("333-33", "홍길동", 20000, 0);
			
		// 예금 
		account1.deposit(30000);
		
		
		// 보너스 포인트 출력 
		System.out.println("현재 보너스 포인트 : "+account1.getBonusPoint());
		System.out.println(account1.getOwner()+"현재 잔액 "+account1.getBalance());
	}

}
