package operators;

public class Exercise07 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean z = (x > 7) && (y <= 5); 
		System.out.println(z);
		z = (x % 3 == 2) || (y % 2 != 1);
		System.out.println(z);
		
		
		//논리합 작동해보기 
		z = (x++ % 2 == 0) || (y++ % 3 == 0); // '||' : 논리합 둘 중 하나만 참이면 참, '|'을 사용하면 y에도 더하기 1을 함
		if(z) {
			System.out.println("true: " + x + ", y : " + y); //x가 true니깐 y에 1을 더하지 않고 참으로 끝냄
		} else {
			System.out.println("false: " + x + ", y : " + y);

		}

	}

}
