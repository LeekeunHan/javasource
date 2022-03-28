package extend;

public class CheckingTrafficCardAccountEx {

	public static void main(String[] args) {
		CheckingTrafficCardAccount account1 = new CheckingTrafficCardAccount
				("111-11", "홍길동", 50000, "555-555", false);
		
		CheckingTrafficCardAccount account2 = new CheckingTrafficCardAccount
				("222-11", "성춘향", 40000, "444-444", true);

		
		//예금
		account1.deposit(10000);
		//출금
		account1.withdraw(20000);
		//체크카드 사용 
		account1.pay("555-555", 30000);
		System.out.println(account1.getOwner()+"님 잔액 : "+account1.getBalance());
		//교통카드 사용 
		account1.payTrafficCard("555-555", 1450);
		System.out.println(account1.getOwner()+"님 잔액 : "+account1.getBalance());
	
		
		System.out.println();
		
		//예금
		account2.deposit(10000);
		//출금
		account2.withdraw(20000);
		//체크카드 사용 
		account2.pay("444-444", 30000);
		System.out.println(account2.getOwner()+"님 잔액 : "+account2.getBalance());
		//교통카드 사용 
		account2.payTrafficCard("444-444", 1450);
		System.out.println(account2.getOwner()+"님 잔액 : "+account2.getBalance());
		
	}

}
