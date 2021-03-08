package abstractClasses;

public class Cat extends Animal {
	
	
	//생성자
	public Cat(String species) {
		super(species);
	}

	
	@Override
	public void sound() {
		System.out.println("야옹");
	}

}
