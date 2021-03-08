package abstractClasses;

public abstract class Animal {
	// 필드 (추상클래스는 new 해서 인스턴스를 만들지 못함)
	String species;

	// 생성자
	public Animal() {
	}

	public Animal(String species) {
		this.species = species;
	}

	// 메소드
	public void showInfo() {
		System.out.println("종류는 " + this.species + "입니다.");
	}

	public void breathe() {
		System.out.println("숨을 쉰다.");
	}

	public abstract void sound(); // 추상메소드 = 앞에 abstract 써주고 이름만 지정

}
