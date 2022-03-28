package exam;

import java.util.Scanner;

public class AccountEx2 {
	
	//멤버변수 
	//static 키워드가 붙으면 공유를 하겠다 라는 의미 
	private static Account2[] accountArray = new Account2[100]; // accountArray 배열을 담아줄공간
	private static Scanner sc = new Scanner (System.in);
	
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while (run) {
			System.out.println("-------------------");
			System.out.println("1.계좌생성 | 2.계좌목록 | 3.예금 | 4.출금 | 5.종료");
			System.out.println("-------------------");
			System.out.print("선택 >> ");
			
			int selectNo = Integer.parseInt(sc.nextLine());
			
			if(selectNo==1) {
				//계좌생성
				createAccount();	//createAccount 메소드 호출 
			}else if (selectNo==2) {
				//계좌목록 보기 
				accountList();
			}else if (selectNo==3) {
				//입금
				deposit();
			}else if (selectNo==4) {
				//출금
				withdraw();
			}else if (selectNo==5) {
				//종료
				run = false;
			}
			
			
		}

	} // main end

	//계좌생성
	private static void createAccount() {	//void의미 : 아무것도 안가지고 돌아가겠다 
		//ano , owner , balance 입력 받기
		System.out.print("계좌번호 입력 : ");
		String ano = sc.nextLine();
		
		System.out.print("계좌주 입력 : ");
		String owner = sc.nextLine();
		
		System.out.print("잔액 입력 : ");
		int balance = Integer.parseInt(sc.nextLine()); // nextint , nextLine을 같이 쓸경우 inter.parseInt 를 써준다

		//Account2 객체 생성
		//Account2 account = new Account2(ano,owner,balance);
		//배열에 담아주기 
		//accountArray[0]=account;
		for(int i=0; i<accountArray.length;i++) {
			if(accountArray[i]==null) {
				accountArray[i]=new Account2(ano,owner,balance);
				System.out.println("계좌 생성 완료");
				break;	//break를 안걸면 for문이 또 돌게됨 / break : for문이 빠져나옴 
			}
		}	
	}
	
	
	//계좌목록
	private static void accountList() {
		//지금까지 생성된 모든 계좌목록 보여주기 
				
		System.out.println("--------------------------");
		System.out.println("계좌번호 , 계좌주 , 잔액 ");
		System.out.println("--------------------------");
		for (int i=0; i<accountArray.length;i++) {
			if(accountArray[i]!=null) {
				System.out.println(accountArray[i].getAno()+" | "+accountArray[i].getOwner()+" | "+accountArray[i].getBalance());
				//외부에서 접근하지못하게private클래스를 썻음 ano,owner,balance를 사용하고 싶다면 geter메소드를 불러 써야함  
			}
			
		}
		
	}
	
	
	//예금
	private static void deposit() {
		// 계좌번호 입력받기 
		System.out.println("계좌번호입력 : ");
		String ano = sc.nextLine();
		
		// 입금액 입력받기 
		System.out.println("예금액 : ");
		int dep = Integer.parseInt(sc.nextLine());
		
		// 입력받은 계좌번호가 배열에 들어 있는지 확인 
		Account2 account=findAccount("입력받은 계좌번호");
		
		//account가 null이 아니면 입금 
		if(account!=null) {
			//잔액 = 잔액 + 예금액
			//account.balance = account.balance + dep; 
			account.setBalance(dep+account.getBalance());
		}else {
			System.out.println("계좌번호 확인 ");
		}
		
		
		
		
	}
	
	
	//출금
	private static void withdraw() {
		// 계좌번호 입력받기 
		System.out.println("계좌번호입력 : ");
				String ano = sc.nextLine();
				
		// 출금액 입력받기 
		System.out.println("출금액 : ");
		int cdep = Integer.parseInt(sc.nextLine());
				
		// 입력받은 계좌번호가 배열에 들어 있는지 확인 
		Account2 account=findAccount("입력받은 계좌번호");
				
		//account가 null이 아니면 출금 
		if(account!=null) {
			//잔액 = 잔액 - 출금액
			//account.balance = account.balance + dep; 
			if(account.getBalance() >= cdep) {
				account.setBalance(account.getBalance()-cdep);
			}else {
				System.out.println("잔액 부족");
			}
		}else {
				System.out.println("계좌번호 확인 ");
		}
	}
	
	
	
	
	private static Account2 findAccount(String ano) {
		//Account2 배열에서 ano와 동일한 Account 찾기 
		
		//for문 
		for(int i= 0; i<accountArray.length;i++) {
			//if (null 아닌 경우만)
			if (accountArray[i]!=null) {
				break;
			}
			//if(Account2 배열에서 ano와 동일한 Account 찾기)
			if(accountArray[i].getAno().equals(ano)) { //문자열끼리 비교할때는 equals 를 쓴다  
				return accountArray[i];
				//Account2 account=findAccount("입력받은 계좌번호"); 여기에 return accountArray[i]; 주소값이 들어옴 
			}
			
		}
		
		
		//찾은 Account2를 리턴 
		return null;	//못찾은 경우 
	}
	
	
	
	
	
	
	
	
	
	
	
}
