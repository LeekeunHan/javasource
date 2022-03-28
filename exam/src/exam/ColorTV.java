package exam;

class ColorTV extends TV{
	private int result;
	
	public ColorTV(int size , int result) {
		super(size);
		this.result=result;
	}
	
	public void printproperty() {
		System.out.println(getsize()+"인치" +result+ "컬러");
	}

}
