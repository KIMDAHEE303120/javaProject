package objects2;

public class ShopServiceExample {
	public static void main(String[] args) {
		ShopService odj1 = ShopService.getInstance();
		ShopService odj2 = ShopService.getInstance();
		
		if(odj1 == odj2) {
			System.out.println("같은 ShopService 객체 입니다.");
		} else {
			System.out.println("다른 ShopService 객체 입니다.");
		}
		
	}

}
