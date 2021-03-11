package generics;
//p.665 와일드카드 타입

class Person {
	String name; // 필드

	Person(String name) { // 생성자
		this.name = name;
	}

	String getName() { // 메소드
		return this.name;
	}

	@Override //결과값을 주소값이 아니라 지정해준 name으로 출력하기 위해 override해줌
	public String toString() {
		return name;
	}
}

//person을 상속받는 worker class
class Worker extends Person {
	Worker(String name) {
		super(name);
	}
}

//person을 상속받는 student class
class Student extends Person {

	Student(String name) {
		super(name);
	}
}

//student를 상속받는 highStudent class
class HighStudent extends Student {

	HighStudent(String name) {
		super(name);
	}
}

//수업과정 
public class Course<T> {
	String courseName;
	T[] students; // 타입이 정해져 있지 않은 (=제너럴타입)배열

	Course(String courseName, int capacity) {
		this.courseName = courseName;
		students = (T[]) new Object[capacity]; // 어떤과정이든 받아올 수 있도록 제너럴타입으로 케스팅+최상위 Object로 배열만듦..
	}

	public void add(T t) {
		for (int i = 0; i < students.length; i++) {
			if (students[i] == null) {
				students[i] = t;
				break;
			}
		}
	}

	public String getCourseName() {
		return this.courseName;
	}

	public T[] getStudents() {
		return this.students;
	}
}
