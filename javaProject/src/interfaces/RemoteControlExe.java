package interfaces;

public class RemoteControlExe {
	public static void main(String[] args) {
		RemoteControl rc = new Television();
		rc.turnOn();
		rc.setVolume(5);
		rc.turnOff();

		System.out.println();
		rc = new Audio();
		rc.turnOn();
		rc.setVolume(6);
		rc.turnOff();

		System.out.println();
		// 익명의 구현 개체 (class DVD.. 같은거 안쓰고 이름없이 구현)
		rc = new RemoteControl() {
			int volume;

			@Override
			public void turnOn() {
				System.out.println("DVD를 켭니다.");
			}

			@Override
			public void turnOff() {
				System.out.println("DVD를 끕니다.");
			}

			@Override
			public void setVolume(int volume) {
				this.volume = volume;
				System.out.println("DVD볼륩 " + volume);
			}
		};
		rc.turnOn();
		rc.setVolume(10);
		rc.turnOff();

	}

}
