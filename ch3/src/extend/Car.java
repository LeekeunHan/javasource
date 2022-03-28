package extend;

public class Car {
	
	private String name;
	final String color="white"; //변경금지 
	
	
	public Car(String name) {
		super();
		this.name = name;
	}
	
	
		//일반메소드 
		public void startCar() {
			System.out.println("시동을 켭니다.");
		}
		
		public void turnOff() {
			System.out.println("시동을 끕니다.");
		}
		
		

		public String getName() {
			return name;
		}



		public void setName(String name) {
			this.name = name;
		}
}
