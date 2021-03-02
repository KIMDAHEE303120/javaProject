package objects;

public class Student { // 클래스이름은 객체를 표현할 수 있는 적절한 이름으로 만듦

	// 속성에 해당 (=필드)
	String studentNo; // 학생번호 p21010101
	String name;
	int grade; // 학년
	int math;
	int eng;

	// 생성자: 필드값을 초기화
	Student() {

	}

	Student(String studentNo) { // 생성자는 매개값을 가질수 있음
		this.studentNo = studentNo; // this=Student를 따라서 만들어진 인스턴스에
	} // 매개값으로 Student클래스를 초기화한다는 의미

	Student(int grade, int eng, int math) {
		this.grade = grade;
		this.eng = eng;
		this.math = math;
	} // 생성자는 필요한 만큼 정의 가능

	// 기능에 해당(=메소드)
	void study() { // 기능을 담당하는 메소드
		System.out.println("공부합니다.");
	}

	void run() {
		System.out.println("운동을 합니다.");
	}

	void introduce() {
		System.out.println("학번: " + studentNo + ", 학년: " + grade + ", 영어점수: " + eng + ", 수학점수: " + math + "\n");
	}

}
