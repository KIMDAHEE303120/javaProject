package objects;

public class Student1Example {
	public static void main(String[] args) {
//		Student1[] students = new Student1[3];
//		students[0] = new Student1("홍길동", 90, 85);
//		students[1] = new Student1("김길동", 88, 85);
//		students[2] = new Student1("이길동", 76, 90);
//		for (Student1 student : students) {
//			student.showinfo();
//		}

		Student1 s1 = new Student1("홍길동", 90, 85);
		Student1 s2 = new Student1("김길동", 80, 75);
		Student1 s3 = new Student1("이길동", 70, 85);
		Student1 s4 = new Student1();
		//s4.name1 = "최길동";
		s4.setName("최길동"); // name1이 Student1클래스 안에서 private으로 설정되어 있기때문에 public으로 선언해준 setName을 사용하여 값을 지정
		s4.setEng(88);
		s4.setMath(70);
		System.out.println(s4.getEng() + ", " + s4.getMath());


		Student1[] students = new Student1[4];
		students[0] = s1;
		students[1] = s2;
		students[2] = s3;
		students[3] = s4;
		for (Student1 stud : students) {
			stud.showinfo();
		}
	}

}
