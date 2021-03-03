package objects2;

public class Calculator {
	
	//필드
	double pi = 3.14;
	
	
	//생성자 (없으면 기본 생성자)
	
	
	//메소드
	public double getArea(double radius) { //원넓이 구하기 *radius=반지름 
		double result = pi * radius; //반지름 구하는 공식..
		return result;
	}

	
	public static double getRect(double d1, double d2) {//사각형.. 
		//**static 메소드 앞에 붙이면 new해서 인스턴스를 새로 안만들어도 됨>getRect가 이미 실행 할 준비가 되어있음
		//**static이 붙은 메소드 = 정적메소드
		double result = d1*d2;
		return result;
	}
	
	
}
