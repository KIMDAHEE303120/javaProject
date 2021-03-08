package inheritances;

public class KumhoTire extends Tire {
	public KumhoTire(String location, int maxRotation) {
		super(location, maxRotation);
	}
	
	@Override
	public boolean roll() {
		// return super.roll(); 부모크래스가 가지고있는 roll메소드를 오버라이딩
		accumlatedRotation++;
		if (accumlatedRotation < maxRotation) {
			System.out.println(location + "KumhoTire 수명: " + (maxRotation - accumlatedRotation) + "회");
			return true;
		} else {
			System.out.println("*** " + location + "KumhoTire 펑크 ***");
			return false;
		}
	}

}
