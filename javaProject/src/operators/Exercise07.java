package operators;

public class Exercise07 {
	public static void main(String[] args) {
		int x = 10;
		int y = 5;
		
		boolean z = (x > 7) && (y <= 5); 
		System.out.println(z);
		z = (x % 3 == 2) || (y % 2 != 1);
		System.out.println(z);
		
		
		//���� �۵��غ��� 
		z = (x++ % 2 == 0) || (y++ % 3 == 0); // '||' : ���� �� �� �ϳ��� ���̸� ��, '|'�� ����ϸ� y���� ���ϱ� 1�� ��
		if(z) {
			System.out.println("true: " + x + ", y : " + y); //x�� true�ϱ� y�� 1�� ������ �ʰ� ������ ����
		} else {
			System.out.println("false: " + x + ", y : " + y);

		}

	}

}
