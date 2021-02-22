package operators;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) { // ����ó�� try, catch���� 
			System.out.println("�����÷ο찡 �߻��Ͽ� ��Ȯ�ϰ� ����� �� ����"); //" > " +e.getMessage() �����޽���
//			System.out.println("integer�� max ��: " + Integer.MAX_VALUE); > 2147483647
//			System.out.println("integer�� min ��: " + Integer.MIN_VALUE); > -2149483648

		}
//		System.out.println("���α׷� ����");
	}

	public static int safeAdd(int left, int right) { //return���� ������ ������ ���� 
		if((right>0)) {  //����� ���
			if(left>(Integer.MAX_VALUE - right)) { //left�� right���� ���� integer�� max���� ������ ���� �ʰ� �ϱ� ���� 
				throw new ArithmeticException("�����÷ο� �߻�"); //���ܹ߻� 
			}
		} else { //right<=0�� ��� (����)
			if(left<(Integer.MIN_VALUE -right)) { //integer�� min���� ������ ���� �ʰ� �ϱ� ����
				throw new ArithmeticException("�����÷ο� �߻�");

			}
		}
		
		return left + right;
	}
	
}
