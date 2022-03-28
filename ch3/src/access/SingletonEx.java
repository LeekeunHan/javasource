package access;

public class SingletonEx {

	public static void main(String[] args) {
		Singleton obj1 = Singleton.GetInstance();
		Singleton obj2 = Singleton.GetInstance();
		
		System.out.println(obj1 == obj2);

		Account account1 = new Account("1111-22", "홍길동", 1000);
		Account account2 = new Account("1111-23", "홍길동", 1000);
		System.out.println(account1==account2);
	}

}
