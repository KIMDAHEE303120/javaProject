package objects2;

public class Student {
	//필드
		int studentNo;
		String name;
		int engScore;
		int mathScore;
		
		//생성자
		public Student() {}
		public Student(int studentNo, String name, int engScore, int mathScore) {
			this.studentNo = studentNo;
			this.name = name;
			this.engScore = engScore;
			this.mathScore = mathScore;		
		}
		
		
		//메소드
		public int getStudentNo() {
			return studentNo;
		}
		public void setStudentNo(int studentNo) {
			this.studentNo = studentNo;
		}
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		public int getEngScore() {
			return engScore;
		}
		public void setEngScore(int engScore) {
			this.engScore = engScore;
		}
		public int getMathScore() {
			return mathScore;
		}
		public void setMathScore(int mathScore) {
			this.mathScore = mathScore;
		}
		
		public void getInfo() {
			System.out.println(
					"학번: " + studentNo + ", 이름: " + name + ", 영어점수: " + engScore + ", 수학점수: " + mathScore + "\n");

		}

}
