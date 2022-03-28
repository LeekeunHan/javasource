package interfacetest;

public class SeparateVolume implements Lendable {

	String requestNo;
	String bookTitle;
	String writer;
	String borrower;
	String checkOutdate;
	int state;
	
	
	public SeparateVolume(String requestNo, String bookTitle, String writer) {
		super();
		this.requestNo = requestNo;
		this.bookTitle = bookTitle;
		this.writer = writer;
	}
	
	
	

	@Override
	public void checkOut(String borrower, String date) {
		if (state!=0) {
			return;
		}
		this.borrower=borrower;
		this.checkOutdate=date;
		this.state=1;
		System.out.println("***"+bookTitle+"이 대출 되었습니다 *** ");
		System.out.println("대출자 : "+borrower);
		System.out.println("대출일 : "+date);
	}

	@Override
	public void checkIn() {
		this.borrower=null;
		this.checkOutdate=null;
		this.state=0;
		System.out.println("***"+bookTitle+"이 반납되었습니다 ***");

	}

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
