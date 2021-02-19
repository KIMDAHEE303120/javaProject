package variables;

public class Variable1 {
	public static void main(String[] args) {
		byte b1 = 100;
		short s1 = 10000;
		int i1 = 25600;
		long l1 = 100000;
		 
		byte result1 = (byte) (b1 + 10); 
		int result2 = s1 + 100; 
		
		int result3 = i1 + 10000;
		long result4 = l1 + 25000; // long형 타입은 25000을 long형태로 바꾸어 연산하기 때문에 오류x (큰타입으로 연산됨)
		
		System.out.println("결과값은 : " + result4);
		
	}
	
	/*int result4 = 5; >>클래스에 소속된 것은 필드,,,,
	System.out.println("결과값은 : " + result4);
	*/
}
