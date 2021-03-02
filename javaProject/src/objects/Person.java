package objects;

public class Person {
	//속성(필드)
	String name;
	int age;
	double weight;
	double height;

	//생성자
	Person() {
	}
	Person(String name, int age, double height, double weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	

	//기능(메소드)
	void eat() {
		System.out.println("먹는다");
	}

	void sleep() {
		System.out.println("잠을 잔다");
	}

	void walk() {
		System.out.println("걷는다");
	}

	void introduce() {
		System.out.println("이름은 " + name + ", 나이는 " + age + "입니다." + "/ 키: " + height + ", 몸무게: " + weight);
	}

}
