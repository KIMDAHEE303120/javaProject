package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println("sum 결과: " + result);

		result = minus(30, 20);
		System.out.println("minus 결과: " + result);

		result = multi(15, 13);
		System.out.println("multi 결과: " + result);

		result = divide(31, 12);//ctrl+마우스로 divide클릭하면 해당 식이 해당하는 메소드로 이동
		System.out.println("divide 결과: " + result);
		
//		printAge(25); //반환해주는 값이 없어서 값을 반환해달라는 식을 사용(=result)하면 에러가 남
	}
	
/*		public static void printAge(int age) {
		System.out.println("나이는 : " + age + "입니다.");
	}
*/
		
	// result = 30, 20의 차이를 계산하는 메소드 minus() 만들기
	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	// result = 15, 13의 곱을 계산하는 메소드 multi() 만들기
	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	// result = 30, 12를 나눈 몫을 계산하는 메소드 divide() 만들기
	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

}
