package controls;

public class Exercise05 {
	public static void main(String[] args) {
		//4x+5y=60의 모든 해 (x, y=10이하의 자연수)형태로 출력 >중첩for 사용

		int x, y = 5;

		for (x = 1; x <= 10; x++) {
			x = (60-5*y)/4;
			System.out.println("(" + x +"), (" + y + ")");
			for (y = 1; y <= 10; y++) {
				y = (60-4*x)/5;
//				System.out.println("(" + x +"), (" + y + ")");
				break;

			}
		
		}

	}

}
