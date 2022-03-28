package interfacetest;

public class SoundableEx {

	
	private static void printSound(Soundable soundable) {
		System.out.println(soundable.sound());		//야옹 , 멍멍 
	}
	
	
	public static void main(String[] args) {
		printSound(new Cat()); // 고양이 객체 생성
		printSound(new Dog()); // 강아지 객체 생성 

	}
	
}
