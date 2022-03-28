package poly;

public class Adminstrator extends Employee {
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+" "+super.getPosition()+"가 열심히 일을 합니다");
	}
}
