package api;

public class Value {
	int Value;

	//생성자 
	public Value(int value) {
		super();
		Value = value;
	}
	
	@Override
	public boolean equals(Object obj) {
		
		//object obj = value2;
		//obj instanceof value : obj 가 value 객체로 변환 할수 있는지 확인
		
		
		
		// 주소비교가 아닌 값 비교 재정의 
		if(obj instanceof Value) {	//true
			//원래 타입으로 강제 형변환 
			Value v = (Value) obj;
			
			if(this.Value == v.Value) {
				return true;
			}
		}
		return false;
	}

	
	
	
	// toString 오버라이딩 
	// 인스턴스가 가지고 있는 문자열 반환 
	@Override
	public String toString() {
		return "Value [Value=" + Value + "]";
	}
	
	
	
	
	
}
