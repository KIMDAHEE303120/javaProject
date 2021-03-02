package objects;

public class ObjectExample {
	public static void main(String[] args) {
		//Student클래스를 활용
		
		Student student = new Student(); // 힙영역에 Student가 가지고 있는 개체를 만듦
		student.studentNo = "s12345";
		student.grade = 2;
		student.eng = 80;
		student.math = 85;
		student.study();
		student.run();
		student.introduce();

		Student student1 = new Student("s23456");//>>new Student라는 생성자호출
		//student1.studentNo = "s23456";
		student1.grade = 3;
		student1.eng = 76;
		student1.math = 88;
		student1.study();
		student1.run();
		student1.introduce();
		
		Student student2 = new Student(4, 70, 80); //(생성자 매개값)
		student2.studentNo = "s23459";
		student2.study();
		student2.run();
		student2.introduce();
	}

}
