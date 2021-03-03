package objects2;

import objects.Student;

public class MethodExample {
	public static void main(String[] args) {

		for (int i = 0; i < args.length; i++) {
			System.out.println("매개값 [" + i + "]: " + args[i]);
		}

		Calculator.getRect(4.5, 2); // static이 붙은 메소드 = instance가 이미 만들어져 있음 **static이 붙은 메소드=**정적메소드

		Calculator cal = new Calculator(); // static이 안붙은 메소드 = instance를 만들어서 실행해야 함
		double result = cal.getArea(3.5);

		// sum(10,20); //아래의 메소드>>static이 설정되지 않았기 때문에 인스턴스 만든 후 실행해야 함

//		Book b1 = new Book("", "", "", 100);
//		Student s1 = new Student();
//		s1.run();
//		s1.study();
	}

	public /* static */ int sum(int a, int b) {
		return a + b;
	}
}

//public = 접근수준 정함
//static = 인스턴스를 사용하지 않아도 됨 (이미 만들어져 있음)
//void = 리턴되는 값이 없다는 의미 