package operators;

public class CheckOverflowExample {
	public static void main(String[] args) {
		try {
			int result = safeAdd(2000000000, 2000000000);
			System.out.println(result);
		} catch(ArithmeticException e) { // 예외처리 try, catch구문 
			System.out.println("오버플로우가 발생하여 정확하게 계산할 수 없음"); //" > " +e.getMessage() 오류메시지
//			System.out.println("integer의 max 값: " + Integer.MAX_VALUE); > 2147483647
//			System.out.println("integer의 min 값: " + Integer.MIN_VALUE); > -2149483648

		}
//		System.out.println("프로그램 종료");
	}

	public static int safeAdd(int left, int right) { //return구문 없으면 컴파일 에러 
		if((right>0)) {  //양수일 경우
			if(left>(Integer.MAX_VALUE - right)) { //left와 right값의 합이 integer의 max값의 범위를 넘지 않게 하기 위함 
				throw new ArithmeticException("오버플로우 발생"); //예외발생 
			}
		} else { //right<=0일 경우 (음수)
			if(left<(Integer.MIN_VALUE -right)) { //integer의 min값의 범위를 넘지 않게 하기 위함
				throw new ArithmeticException("오버플로우 발생");

			}
		}
		
		return left + right;
	}
	
}
