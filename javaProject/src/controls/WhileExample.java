package controls;

public class WhileExample {
	public static void main(String[] args) {
		// �ݺ���
		// for(int i=1; i<=9; i++) {....} >for���� ��쿡�� �̷��� ��

		// 1~10�� �� ���ϱ� 1
		int sum = 0;
		int i = 1;
		while (i <= 10) {
			sum = sum + i;
			i++;
		}
		System.out.println("1~10�� ��: " + sum);

		// 1~10�� �� ���ϱ� 2
		i = 1; // ������ i=11�� ������ �ٽ� 1�� ����
		sum = 0; // ������ sum=55�� ������ �ٽ� 0���� ����
		while (true) { // ���ѹݺ�
			sum = sum + i;
//			i++; > ���⿡ ������ 9���� �ݺ�			
			if (i >= 10) {
				break; // ��� ������ �����ϸ� ����������� ������ �־���� ��
			}

			i++;

		}
		System.out.println("1~10�� ��: " + sum);

		
	}

}
