package shop;

public class MyShopEx {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//IShop shop = new MyShop();
		MyShop shop = new MyShop();
		
		// 상호지정
		shop.setTitle("MyShop");
		// 고객(user)생성
		shop.genUser();
		// 제품생성
		shop.genProduct();
		// shop 시작
		shop.start();
	}

}
