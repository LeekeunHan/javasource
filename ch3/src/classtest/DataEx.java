package classtest;

public class DataEx {

	public static void main(String[] args) {
		
		Data d =new Data();
		
		d.x=10;
		System.out.println("main d.x = "+d.x);
		
		//change(d.x);
		change(d);
		System.out.println("change() 호출후");
		System.out.println("main d.x = "+d.x);
		
		DataEx obj = new DataEx ();
		obj.print();
	}
	
	static void change (int x) {	//기본형 매개변수(인자) / 값이 그자리에서만 사용되고 소멸
		x = 1000;
		System.out.println("change x =" +x );
	}
	
	static void change (Data obj) {	//참조형 매개변수 / 값이 공유가 가능함 
		obj.x = 1000;
		System.out.println("change x =" +obj.x );
	}
	
	void print() {
		
	}

}
