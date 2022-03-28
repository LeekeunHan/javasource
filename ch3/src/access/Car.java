package access;

public class Car {
	private int speed;
	private boolean stop;
	
	//private 생성자 
	private Car(int speed, boolean stop) {
		super();
		this.speed = speed;
		this.stop = stop;
	}

	
	//get타입 
	public int getSpeed() {
		return speed;
	}
	
	//set타입
	public void setSpeed(int speed) {
		this.speed = speed;
	}
	
	//get타입인데 boolean 타입의 변수는 is 로 바꿔서 나온다 
	public boolean isStop() {
		return stop;
	}

	//set타입
	public void setStop(boolean stop) {
		this.stop = stop;
	}
	
	
	
}
