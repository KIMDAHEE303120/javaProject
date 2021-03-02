package objects;

public class Cal {

	public static void main(String[] args) {
		// 문자열타입
		showinfo("홍길동");
		showinfo("김길동");

		// Student2 클래스
		Student2 std = new Student2();
		std.setName("최길동");
		std.setEng(90);
		std.setMath(95);
		showinfo(std);

		System.out.println();
		// 배열
		Student2[] stds = new Student2[3];
		stds[0] = new Student2("임성원", 77, 88);
		stds[1] = new Student2("정준영", 79, 89);
		stds[2] = new Student2("도왕락", 82, 86);
		showinfo(stds);

	}

	public static void showinfo(Student2[] students) { // 배열
		for (Student2 std : students) {
			if(std != null) {//null이 나와도 오류 안나게 할라고,,, 
			showinfo(std);
			}
		}
	}

	public static void showinfo(Student2 student) { // Student2를 받아서 실행하는 메소드
		System.out.println(student.getName() + ", 안녕하세요.");
		System.out.println("영어점수는 " + student.getEng() + ", 수학점수는 " + student.getMath() + ", 합계는 "
				+ (student.getEng() + student.getMath()) + "입니다.");
	}

	public static void showinfo(String name) { // 문자열 받아서 실행하는 메소드
		System.out.println(name + ", 안녕하세요.");
	}

}
