package streams;

public class Student implements Comparable<Student> {
	private String name;
	private int engScore;
	private int mathScore;

	public Student(String name, int engScore, int mathScore) {
		this.name = name;
		this.engScore = engScore;
		this.mathScore = mathScore;
	}

	public String getName() {
		return name;
	}

	public int getEngScore() {
		return engScore;
	}
	
	public int getMathScore() {
		return mathScore;
	}

	@Override
	public int compareTo(Student o) {
		//return this.score - o.score ; //-1:오름차순
		return this.name.compareTo(o.name); //이름 
	}

//	@Override
//	public int compareTo(Student o) {
//		if (this.score < o.score) {
//			return 1;
//		} else {
//			return -1;
//		}
//	}

}
