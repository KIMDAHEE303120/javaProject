package operators;

public class Exercise06 {
	public static void main(String[] args) {
		int lengthTop = 5;
		int lengthBottom = 10;
		int height = 7;

	// ��ٸ��� ���� ���ϴ� �޼ҵ� 1.
		double area = (lengthTop + lengthBottom) / 2.0 * height;
		System.out.println(area);

	}
	
	//��ٸ��� ���� ���ϴ� �޼ҵ� 2.
	public static double getRectArea(int top, int bottom, int height) {
		double area = (double)(top+bottom) / 2 * height;
		System.out.println(area);
		
		return area;
	}

}
