package collections;

public class Student {
	// 필드
	private int sno;
	private String name;

	// 생성자(constructor)
	public Student(int sno, String name) {
		this.sno = sno;
		this.name = name;
	}
		

	@Override
	public int hashCode() {
		return this.sno + this.name.hashCode();
	} 
	
	// 번호와 이름이 같으면 같은 해시코드값을 리턴하겠다는 의미

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Student) {
			Student s = (Student) obj;
			return this.sno == s.sno && this.name.equals(s.name);
		}
		return false;
	}

	@Override
	public String toString() {
		return "Student [sno=" + sno + ", name=" + name + "]";
	}

}
