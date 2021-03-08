package inheritances;

public class ComFriend extends Friend {
	String department;

	public ComFriend(String name, String phone, String department) {
		super(name, phone);
		this.department = department;
	}

	@Override
	public String toString() {
		return "ComFriend [department=" + department + ", name=" + getName() + ", phone=" + getPhone() + "]";
	}

	public String getDepartment() {
		return department;
	}

	public void setDepartment(String department) {
		this.department = department;
	}

}
