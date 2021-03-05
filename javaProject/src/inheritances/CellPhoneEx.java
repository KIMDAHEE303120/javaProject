package inheritances;

public class CellPhoneEx {
	public static void main(String[] args) {
		CellPhone cp = new CellPhone();
		cp.model = "Galaxy";
		cp.color = "White";
		cp.powerOn();
		cp.bell();
		cp.powerOff();
		
		//CellPhone에 지정하지 않은 메소드이지만 object라는 클래스가 모든 클래스의 원천이기때문에 클래스들은 object의 클래스를 상속받아서 
		// 지정하지 않은 메소드를 사용할 수 있음
		cp.equals("");
		cp.getClass();
		cp.toString();
		
		
		System.out.println("==========================================");
		
		DmbPhone dp = new DmbPhone();
		dp.model = "Motolora";
		dp.color = "Black";
		dp.channel = 10;
		dp.powerOn();
		dp.bell();
		dp.turnOnDmb();
		dp.changeChannel(20);
		dp.turnOffDmb();
		dp.powerOff();
				
		System.out.println("==========================================");

		SmartPhone sp = new SmartPhone();
		sp.model = "LGPhone";
		sp.color = "pink";
		sp.commonMethod();
		
		System.out.println("==========================================");
		
		System.out.println(cp.toString());
		System.out.println(dp.toString());
		System.out.println(sp.toString());
	}

}
