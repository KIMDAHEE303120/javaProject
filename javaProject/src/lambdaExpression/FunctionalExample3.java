package lambdaExpression;

@FunctionalInterface
interface MyFuncInterface {
	int run(int a, int b);
}

public class FunctionalExample3 {
	public static void main(String[] args) {
		MyFuncInterface mfi = (a, b) ->  a + b;
	
		int result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result + "입니다.");
		
		mfi = (num1, num2) -> num1 * num2;
		result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result + "입니다.");
		
		mfi = (a1, b1) -> (a1 * b1) / 2;
		result = mfi.run(10, 20);
		System.out.println("실행결과는 " + result + "입니다.");
				
	}

}
