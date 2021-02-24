package controls;

public class Exercise04 {
	public static void main(String[] args) {
		// 두 주사위 합이 5일때 실행멈춤(while문, Math.random() 메소드사용)

		int result = 0;
		while (true) {
			int x = (int) (Math.random() * 6) + 1;
			int y = (int) (Math.random() * 6) + 1;
			result = x + y;
			System.out.println("(" + x + "), (" + y + ")");
			
			if (result == 5) {
				break;
			} else {

			}

		}

	}

}
