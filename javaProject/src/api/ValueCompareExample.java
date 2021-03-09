package api;

public class ValueCompareExample {
	public static void main(String[] args) {
		System.out.println("[-128~127 초과값일 경우");
		Integer obj1 = 300;
		Integer obj2 = 300;
		System.out.println("'==' 결과: " + (obj1 == obj2)); //동일한 값을 가지고 있지만 false가 출력됨
		//*****boolean, char, byte, short. int 의 값이면 '==', '!='으로 비교할 수 있지만 그 외에는 비교할 수 없다.*****
		System.out.println("언박싱 후 '==' 결과:" + (obj1.intValue() == obj2.intValue()));
		System.out.println("equals() 결과: " + obj1.equals(obj2));
		System.out.println();

		System.out.println("[-128~127 범위값일 경우");
		Integer obj3 = 10;
		Integer obj4 = 10;
		System.out.println("'==' 결과: " + (obj3 == obj4));
		System.out.println("언박싱 후 '==' 결과:" + (obj3.intValue() == obj4.intValue()));
		System.out.println("equals() 결과: " + obj3.equals(obj4));
	}

}
