package api;

/*
 * Wrapper 클래스 
 * 기본형 타입을 객체로 다루기 위한 클래스 
 * 
 * int => Integer (Integer.parseInt())
 * boolean => Boolean  
 * byte => Byte
 * short => Short
 * char => Character
 * */


public class WrapperEx1 {

	public static void main(String[] args) {
		Boolean b = Boolean.valueOf(true);
		//객체로 만들어서 처리 하겠다 
		Integer i = Integer.valueOf(100); //Integer i = new Integer(100) 9버전부터제거
		
		int i2= 100;
		
		System.out.println(i == i2);
		System.out.println(b);
		
		

	}

}
