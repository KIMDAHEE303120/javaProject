package exceptions;

public class ArrayIndexOutOfBoundsExceptionExample {
	public static void main(String[] args) {
		if (args.length == 2) {
			String date1 = args[0];
			String date2 = args[1];

			System.out.println("args[0]: " + date1);
			System.out.println("args[1]: " + date2);
		} else {
			System.out.println("[실행 방법]");
			System.out.print("java ArrayIndexOutOfBoundsExceptionExample	");
			System.out.print("값1 값2");
		}
	}

}
