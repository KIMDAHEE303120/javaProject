package api;

import java.util.Arrays;

//equal() 메소드 p.459

//clone()메소드 p.467

//clone() 깊은복제 p.470

public class Member implements Cloneable {
//	public String id;
//	public Member(String id) {
//		this.id = id;
//	}
//	@Override
//	public boolean equals(Object obj) {
//		if (obj instanceof Member) {
//			Member member = (Member) obj;
//			if (id.equals(member.id)) {
//				return true;
//			}
//		}
//		return false;
//	}
//---------------------------------------------------

//	public String id;
//	public String name;
//	public String password;
//	public int age;
//	public boolean adult;
//
//	public Member(String id, String name, String password, int age, boolean adult) {
//		this.id = id;
//		this.name = name;
//		this.password = password;
//		this.age = age;
//		this.adult = adult;
//	}
//
//	public Member getMember() {
//		Member cloned = null;
//	
//	try {
//		cloned = (Member) clone();
//	} catch (CloneNotSupportedException e) {}
//	return cloned;
//	
//	}---------------------------------------------------------

	public String name;
	public int age;
	public int[] scores;
	public Car car;

	public Member(String name, int age, int[] scores, Car car) {
		this.name = name;
		this.age = age;
		this.scores = scores;
		this.car = car;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		// 얕은 복제를 해서 name, age 복제
		Member cloned = (Member) super.clone();
		// scores 깊은 복제
		cloned.scores = Arrays.copyOf(this.scores, this.scores.length);
		// car 깊은 복제
		cloned.car = new Car(this.car.model);
		// 깊은 복제된 Member 객체를 리턴
		return cloned;
	}

	 public Member getMember() {
		 Member cloned = null;
		 try {
			 cloned = (Member) clone();
		 } catch (CloneNotSupportedException e) {
			 e.printStackTrace();
		 }
		 return cloned;
	 }
}
