package operators;

public class MethodExample {
	public static void main(String[] args) {
		int result = sum(10, 20);
		System.out.println("sum ���: " + result);

		result = minus(30, 20);
		System.out.println("minus ���: " + result);

		result = multi(15, 13);
		System.out.println("multi ���: " + result);

		result = divide(31, 12);//ctrl+���콺�� divideŬ���ϸ� �ش� ���� �ش��ϴ� �޼ҵ�� �̵�
		System.out.println("divide ���: " + result);
		
//		printAge(25); //��ȯ���ִ� ���� ��� ���� ��ȯ�ش޶�� ���� ���(=result)�ϸ� ������ ��
	}
	
/*		public static void printAge(int age) {
		System.out.println("���̴� : " + age + "�Դϴ�.");
	}
*/
		
	// result = 30, 20�� ���̸� ����ϴ� �޼ҵ� minus() �����
	public static int minus(int a, int b) {
		int result = a - b;
		return result;
	}

	// result = 15, 13�� ���� ����ϴ� �޼ҵ� multi() �����
	public static int multi(int a, int b) {
		int result = a * b;
		return result;
	}

	// result = 30, 12�� ���� ���� ����ϴ� �޼ҵ� divide() �����
	public static int divide(int a, int b) {
		int result = a / b;
		return result;
	}

	public static int sum(int a, int b) {
		int result = a + b;
		return result;
	}

}
