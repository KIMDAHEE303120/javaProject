package objects2;

public class ShopService {
	
	//정적 필드
	public static ShopService singleton = new ShopService();

	
	//생성자
	private ShopService() {
		
	}
	
	//정적 메소드
	static ShopService getInstance() {
		return singleton;
	}
	
}
