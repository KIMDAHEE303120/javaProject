package generics;
//p.665 제한된 타입 파라미터

public class BoundedTypeParameterExample {
	public static void main(String[] args) {
		// String str = Utils.compare("a", "b"); >>number 타입이 아니기때문에 사용XX

		int result1 = Utils.compare(10, 20); // >>int>integer(자동Boxing)
		System.out.println(result1);

		int result2 = Utils.compare(4.5, 3); // >>double>Double(자동Boxing)
		System.out.println(result2);
		
		//첫 번째 매개값이 작이면 -1, 같으면 0, 크면 1을 리턴

	}

}
