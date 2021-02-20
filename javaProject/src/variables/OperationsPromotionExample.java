package variables;

public class OperationsPromotionExample {
	public static void main(String[] args) {
		byte byteValue1 = 10;
		byte byteValue2 = 20;
		//        byte byteValue3 = byteValue1 + byteValue2; >byte는 int로 식 만들어야 하는듯,,, 잘 모르겠음
		int intValue1 = byteValue1 + byteValue2;
		System.out.println(intValue1);
		
		
		char charValue1 = 'A';
		char charValue2 = 1;
		//char charValue3 = charValue1 + charValue2;
		int intValue2 = charValue1 + charValue2;
		System.out.println("유니코드 = " + intValue2);
		System.out.println("출력문자 = " + (char)intValue2);
		//유니코드 'A(=65)'보다 1만큼 큰 값인 'B(=66)'가 출력..!
		//System.out.println("charValue1의 유니코드 = " + (int)charValue1);>'A'=65인것을 확인
		
		
		int intValue3 = 10;
		int intValue4 = intValue3/4;
		System.out.println(intValue4);
		// 소수점은 안나오네..
		
		int intValue5 = 10;
		//		int intValue6 = 10 / 4.0;  > 정수가 아닌 4.0이 와서 컴파일 에러
		double doubleValue = intValue5 / 4.0;
		System.out.println(doubleValue);
	
	}

	
}


