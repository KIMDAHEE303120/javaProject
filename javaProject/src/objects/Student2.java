package objects;

public class Student2 {
	//속성(필드)
	private String name;
	private int eng;
	private int math;

	
	//생성자
	public Student2() {
	}
	public Student2(String name, int eng, int math) {
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	
	//기능(메소드)
	public Student2(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getEng() {
		return eng;
	}

	public void setEng(int eng) {
		this.eng = eng;
	}

	public int getMath() {
		return math;
	}

	public void setMath(int math) {
		this.math = math;
	}

}