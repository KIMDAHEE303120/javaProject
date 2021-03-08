package inheritances;

public class Friend {
	// 속성
	private String name;
	private String phone;

	// 생성자
	public Friend(String name, String phone) {
		this.name = name;
		this.phone = phone;
	}

	// 메소드
	@Override
	public String toString() {
		return "Friend [name=" + name + ", phone=" + phone + "]";
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

}
