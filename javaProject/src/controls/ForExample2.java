package controls;

public class ForExample2 {
	public static void main(String[] args) {
		//구구단
//		int num = 4;
//		for (int i=1; i<=9; i++) {
//			System.out.println(num + " * " + i + " = " + (num * i));
		for (int i = 2; i <= 9; i++) {
			showresult(i);
		}
	} // end of main
	

	public static void showresult(int num) {
		for (int i = 1; i <= 9; i++) {
			System.out.println(num + " * " + i + " = " + (num * i));
		}
	}
}