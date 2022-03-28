package poly;

public class Buyer {
	int money = 1000;
	int bonusPoint = 0;
	
	Product items[] = new Product[10]; //필드선언 
	
	
	int i=0;
	
	
	void buy(Product p) {
		if (money <p.price) {
			System.out.println("잔액 부족으로 물건 구매 불가");
			return;
		}
		
		money-=p.price;
		bonusPoint +=p.bonusPoint;
		items[i++] = p;	//부모(items) 가 자식(p) 사용 =>그럼 p에는 Tv,computer,audio구입 
		System.out.println(p+"을/를 구매하였습니다");
	}
	
	
//	void buy(Tv p) {
//		if (money <p.price) {
//			System.out.println("잔액 부족으로 물건 구매 불가");
//			return;
//		}
//		
//		money-=p.price;
//		bonusPoint +=p.bonusPoint;
//		System.out.println(p+"을/를 구매하였습니다");
//	}
	
//	void buy(Computer p) {
//		if (money <p.price) {
//			System.out.println("잔액 부족으로 물건 구매 불가");
//			return;
//		}
//		
//		money-=p.price;
//		bonusPoint +=p.bonusPoint;
//		System.out.println(p+"을/를 구매하였습니다");
//	}
}
