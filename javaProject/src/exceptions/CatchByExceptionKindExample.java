package exceptions;
//p.433 다중catch 예제(일반예외처리)

public class CatchByExceptionKindExample {
	public static void main(String[] args) {
		try {
			String date1 = args[0];
			String date2 = args[1];
			int value1 = Integer.parseInt(date1);
			int value2 = Integer.parseInt(date2);
			int result = value1 + value2;
			System.out.println(date1 + "+" + date2 + "=" + result);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("실행 매개값의 수가 부족합니다.");
			System.out.println("[실행방법]");
			System.out.println("java TryCatchFinallyRuntimeExceptionExample num1 num2");
		} catch (NumberFormatException e) {
			System.out.println("숫자로 변환할 수 없습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
