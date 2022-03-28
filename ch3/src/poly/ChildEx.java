package poly;

public class ChildEx {

	public static void main(String[] args) {
		Child child = new Child();
		
		child.method1();
		child.method2();
		child.method3();
		
		System.out.println();
		
		//부모-자식관계 => (다형성)코드 
		//parent 변수가 접근할 수 있는 범위는 부모클래스에 있는 필드와
		//메소드만 접근 가능 
		//단 , 오버라이딩 된 메소드가 있다면 자식 클래스의 메소드가 대신 호출됨 
		Parent parent = new Child(); // 항상 왼쪽에 부모 , 오른쪽에 자식이 와야함 바뀌면 안됨 !! 
		parent.method1();
		parent.method2();
		
		//Child2 child2 = new Child();
		
		
		// error 가 뜬다 
		Child c = (Child) new Parent();
		c.method1();
	}

}
