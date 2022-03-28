package classtest;

public class Car {
	// 속성(property , 필드 , attribute) : 제조회사(현대) , 모델(아우디) , 색상(red) , 속도(200) ..... //변수의 형태로 만듬
	String company; //제조회사
	String model;	//모델
	String color;	//색상
	int maxSpeed;	//속도
	
	//기능 : 전진한다. 후진한다 // 메소드의 형태로 만듬
	void forward() {
		System.out.println("전진한다");
	}
	void backward() {
		System.out.println("후진한다");
	}
	
	
	
}
