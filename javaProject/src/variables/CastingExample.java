package variables;

public class CastingExample {
	public static void main(String[] args) {
	
		int intValue = 44032;
		char charValue = (char) intValue;
		System.out.println(charValue);
		
		long longValue = 500;
		intValue = (int) longValue;
		System.out.println(intValue);
		
		double doubleValue = 3.14;
		intValue = (int) doubleValue;
		System.out.println(intValue);
		
		
		int i = 127;
		
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE) {
			System.out.println("byte타입으로 변환할 수 없습니다.");
			System.out.println("값을 확인하세요.");
		}
		else {
			byte b = (byte) i;
			System.out.println("byte타입 값 : " + b);
		}
		
	}

}
