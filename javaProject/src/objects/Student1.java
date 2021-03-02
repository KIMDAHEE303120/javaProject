package objects;

public class Student1 {

	// 속성(필드)
	private String name; // 다른 클래스에서 실행하려고 하면 숨겨져있기 때문에 오류남, 같은 클래스에서는 사용가능

	int math;
	int eng;

	// 생성자
	Student1(String name, int eng, int math) { // 생성자도 private 사용가능, 앞에 아무것도 없다면 디폴트로 public(=같은 package안에서 사용 가능)
		this.name = name;
		this.eng = eng;
		this.math = math;
	}

	Student1() {

	}

	// 기능(메소드)
	void showinfo() {
		System.out.println("이름: " + name + ", 영어: " + eng + ", 수학: " + math + ", 합계: " + (eng + math));
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setEng(int eng) { //다른 크래스에서 값을 '-'로 입력하는 경우가 생길 수 있기 때문에 메소드를 만들어서 불러오기도 함
		if (eng < 0) {
			this.eng = 0;
		} else {
			this.eng = eng;
		}
	}

	public void setMath(int math) {
		if (math < 0) {
			this.math = 0;
		} else {
			this.math = math;
		}
	}
	
	public int getEng() {
		return this.eng;
	}
	public int getMath() {
		return this.math;
	}
	public String getName() {
		return this.name;
	}
	
	
	
	
}
