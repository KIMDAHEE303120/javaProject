package lambdaExpression;

interface MyfunctionalInterface {
	void run(); // 구현해야할 메소드가 하나만 있는 인터페이스 : FunctionalInterface
}

class MyFunctionClass implements MyfunctionalInterface {

	@Override
	public void run() {
		System.out.println("run을 실행합니다.");
	}

}

public class FunctionalExample {
	public static void main(String[] args) {
		MyfunctionalInterface mif = new MyfunctionalInterface() {// 익명의 구현개체를 만드는 경우

			@Override
			public void run() {
				System.out.println("run()을 실행합니다.");

			}

		};
		mif.run();

		mif = () -> System.out.println("run() 매소드를 실행합니다.");
		// 익명의 구현객체를 람다식으로 만드는 경우(메소드가 하나만 있는 경우, 중괄호도 생략가능)

		mif.run();
	}

}
