package inheritances;

public class CellPhoneEx2 {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
//		cp = new DmbPhone(); // 부모클래스는 자식클래스의 인스턴스를 담을 수 있음
//		cp =/*(CellPhone) < 따로 명시하지 않아도 됨*/ new SmartPhone();
		cp.color = "";
		// instance를 담을 수는 있지만

		if (cp instanceof DmbPhone) {
			DmbPhone dp = (DmbPhone) cp; // 부모클래스를 자식클래스에 담는거
			dp.model = "";
			dp.color = "";
			dp.channel = 15;
			dp.powerOn();
			dp.powerOff();
		} else {
			System.out.println("Casting 할 수 없습니다. ");
		}
		//다형성
		//부모 = 자식들..
		//부모.메소드=자식.메소드;
		
		cp = new DmbPhone(); //DmbPhone에 담신 override를 실행
		cp.powerOn(); 
		
		cp = new SmartPhone(); //SmartPhone에 담긴 override를 실행
		cp.powerOn();
	}

}
