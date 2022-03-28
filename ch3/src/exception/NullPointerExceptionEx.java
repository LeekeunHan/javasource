package exception;

public class NullPointerExceptionEx {

	public static void main(String[] args) {
		//에러내용 : java.lang.NullPointerException
		Account[] account = new Account[2];
		System.out.println(account[0]);
		
		try {
			System.out.println(account[0].accountNo);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		
		// .accountNo 때문에 에러가뜸 , 가리킨값을 가져와바 !! 
		//System.out.println(account[0].accountNo);
	}

}
