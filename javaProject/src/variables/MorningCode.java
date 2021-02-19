package variables;

public class MorningCode {
	public static void  main(String[] args) {
		int a1 = 30;
		int a2 = 27;
		
		int result = a1 + a2;
		
		if (result < 30) {
			System.out.println("나이가 좀 들었습니다.");
		}
		else if (result > 30) {
			System.out.println("한창이네요.");
		}
		else {
			System.out.println("적정한 나이입니다.");
		}
	}

}
