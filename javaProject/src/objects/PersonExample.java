package objects;

public class PersonExample {
	public static void main(String[] args) {
		Person person1 = new Person("홍길동", 30, 181.1, 60);
		// person1.name = "홍길동";
		// person1.age = 20;
		// person1.weight = 60.5;
		// person1.height = 180.1;
		person1.eat();
		person1.sleep();
		person1.walk();
		person1.introduce();

		System.out.println("-----------------------------------------------");

		Person person2 = new Person("김길동", 31, 171.4, 61);
		// person2.name = "김길동";
		// person2.age = 21;
		// person2.weight = 61;
		// person2.height = 181;
		person2.eat();
		person2.sleep();
		person2.walk();
		person2.introduce();

		System.out.println("-----------------------------------------------");

		Person[] persons = new Person[5];
		persons[0] = new Person("홍길동", 15, 175.8, 72.5);
		persons[1] = new Person("김길동", 17, 180.3, 72.5);
		persons[2] = new Person("이길동", 20, 179.6, 72.5);
		persons[3] = new Person("박길동", 21, 179.2, 72.5);
		persons[4] = new Person("최길동", 25, 182.3, 72.5);
		for (Person person : persons) {
			if (person.age > 20 && person.height>180) {
				person.introduce();
			}
		}
	}

}
