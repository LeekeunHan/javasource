package abstracttest;

public class CarEx {

	public static void main(String[] args) {
		//Cannot instantiate the type Car
		// Car car = new Car();
		
		Car car = new SportCar();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();
		
		System.out.println();
		
		car = new Truck();
		car.startCar();
		car.drive();
		car.stop();
		car.turnOff();

	}

}
