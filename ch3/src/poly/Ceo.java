package poly;

public class Ceo extends Employee {
	@Override
	public void work() {
		// TODO Auto-generated method stub
		System.out.println(super.getName()+" "+super.getPosition()+"가 일을 합니다");
	}
}
