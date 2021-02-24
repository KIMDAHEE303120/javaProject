package controls;

import java.io.IOException;

public class WhileKeyControlExample {

	public static void main(String[] args) throws IOException {
		boolean run = true;
		int speed = 0;
		int KeyCode = 0;

		while (run) {
			if (KeyCode != 13 && KeyCode != 10) { //enter 캐치=13, 라인=10 이기 때문에 제외시켜줘야 함
				System.out.println("---------------------");
				System.out.println("1. 증속 |2. 감속 |3. 중지 ");
				System.out.println("---------------------");
				System.out.print("선택: ");
			}

			KeyCode = System.in.read();

			if (KeyCode == 49) { // 1을 읽었을 경우
				speed++;
				System.out.println("현재속도=" + speed);
			} else if (KeyCode == 50) { // 2를 읽었을 경우
				speed--;
				System.out.println("현재속도=" + speed);
			} else if (KeyCode == 51) { // 3을 읽었을 경우
				run = false;
			}
		}
		System.out.println("end of program");
	}
}
