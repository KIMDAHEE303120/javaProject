package operators;

public class CompareOperatorExample1 {
	public static void main(String[] args) {
		int num1 = 10;
		int num2 = 10;
		boolean result1 = (num1 == num2); // 같은지
		boolean result2 = (num1 != num2); // 다른지
		boolean result3 = (num1 <= num2); // 같거나 작은지 검사
		System.out.println("result1= " + result1);
		System.out.println("result2= " + result2);
		System.out.println("result3= " + result3);

		char char1 = 'A';
		char char2 = 'B';
		boolean result4 = (char1 < char2);
		System.out.println("result4= " + result4); // 유니코드 A=65, B=66이기 때문에 true출력됨

	}
}
