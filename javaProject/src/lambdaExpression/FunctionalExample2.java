package lambdaExpression;

@FunctionalInterface
interface MyFunctionInterface {
	void run(String str);
}

public class FunctionalExample2 {
	public static void main(String[] args) {
		MyFunctionInterface mif = (str) -> System.out.println(str + "을 실행합니다. ");
		mif.run("run()");
		mif.run("call()");
	}

}
