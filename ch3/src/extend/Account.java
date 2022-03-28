package extend;

public class Account {
	//속성 : 계좌번호(111-11-1234), 소유자(홍길동) , 잔액(정수)
	private String accountNo;
	private String owner;
	private int balance;
	
	//생성자 
	public Account(String accountNo, String owner, int balance) {
		super();
		this.accountNo = accountNo;
		this.owner = owner;
		this.balance = balance;
	}
	
	
	//기능 : 입금한다 , 출금한다 
	//입금한다 (deposit) : 입금액을 입력받아 현재 잔액에 추가 
	int deposit(int amount) {
		this.balance+=amount;
		return balance; 
	}
	//출금한다(withdraw) : 출금액을 입력받아 현재 잔액에서 감소 
	int withdraw(int amount) {
		this.balance-=amount;
		return balance;
	}


	//geter , seter 생성 
	public String getAccountNo() {
		return accountNo;
	}


	public void setAccountNo(String accountNo) {
		this.accountNo = accountNo;
	}


	public String getOwner() {
		return owner;
	}


	public void setOwner(String owner) {
		this.owner = owner;
	}


	public int getBalance() {
		return balance;
	}


	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	
	
	
	
	
}
