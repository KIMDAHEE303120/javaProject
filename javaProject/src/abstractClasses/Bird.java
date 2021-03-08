package abstractClasses;

public class Bird extends Animal {
	
	
	//생성자
	public Bird(String species) {
		super(species);
	}
	

	@Override //추상메소드인 sound에 내용을 지정
	public void sound() {
		System.out.println("짹짹");
	}

	
}
