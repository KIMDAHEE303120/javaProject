package variables;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) { //i�� ������ +1�� �ϵ�, i�� 5���� ������ ���� ������Ű��� �ǹ�(=5�� �ݺ�)
			var1++;//1�� �����϶�� �ǹ�
			var2++;//byte Ÿ������ �����
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);//tab
			
//			var1 = byte = -128~127
//			01111111 = 127
//			10000000 = -128 
//			^ 
//			���ڸ��� ��ȣ (+/-)
			
						
		}
		
	}

}
