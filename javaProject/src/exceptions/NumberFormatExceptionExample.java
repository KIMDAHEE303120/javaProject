package exceptions;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String date1 = "100";
		String date2 = "a100";

		int value1 = Integer.parseInt(date1);
		int value2 = Integer.parseInt(date2); //NumberFormatException 발생 >> date2에 문자열 a 가 포함되어있어서 오류 발생

		int result = value1 + value2;
		System.out.println(date1 + "+" + date2 + "=" + result);

	}

}
