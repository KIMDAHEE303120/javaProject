package nestedClasses;

public class TriFor {
	public static void main(String[] args) {
		int[][] ary = new int[5][5];
		int num = 1;
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				ary[i][j] = num++;
				System.out.printf("%3s", ary[i][j]);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3s", ary[j][i]);
			}
			System.out.println();
		}
		
		System.out.println("---------------");
		for (int i = 0; i < ary.length; i++) {
			for (int j = 0; j < ary[i].length; j++) {
				System.out.printf("%3s", ary[j][i]);
			}
			System.out.println();
		}
		
//		System.out.println("---------------");
//		num = 25;
//		for (int i = 0; i < ary.length; i++) {
//			for (int j = 0; j < ary[i].length; j++) {
//				ary[i][j] = num--;
//				System.out.printf("%3s", ary[i][j]);
//			}
//			System.out.println();
//		}

	}
}
