package controls;

public class Exercise03 {
	public static void main(String[] args) {
		//1~100까지의 정수 중 3의 배수의 합 구하기(for문)
		int x = 0;
		for (int i=1; i<=100; i++ ) {
			if (i%3==0) {
			 x = x + i;
			}
		}
		System.out.println("3의 배수의 합: " + x);
	}
}
