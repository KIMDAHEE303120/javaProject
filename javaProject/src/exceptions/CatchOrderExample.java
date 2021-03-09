package exceptions;
//p.436 catch블록의 순서 


public class CatchOrderExample {
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
		} catch (Exception e) {
			System.out.println("실행에 문제가 있습니다.");
		} finally {
			System.out.println("다시 실행하세요.");
		}
	}

}
