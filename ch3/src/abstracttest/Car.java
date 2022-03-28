package abstracttest;

//추상클래스 : 템플릿 메소드를 가지고있음 

public abstract class Car {
	
	//추상메소드 : 템플릿 메소드 , 틀만 가져다 내림 , abstract쓰면 무조곤 추상클래스 
	public abstract void drive();
	public abstract void stop();
	
	
	//일반메소드 
	public void startCar() {
		System.out.println("시동을 켭니다.");
	}
	
	public void turnOff() {
		System.out.println("시동을 끕니다.");
	}
	
}
