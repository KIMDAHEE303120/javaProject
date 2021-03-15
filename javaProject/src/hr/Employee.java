package hr;

public class Employee implements Comparable<Employee> { // DB연결할 때
	private int employeeId; // employee_id
	private String firstname;
	private String lastname;
	private String email;
	private String phoneNumber;
	private String hireDate;
	private String jobId;
	private int salary;

	public int getEmployeeId() {
		return employeeId;
	}

	public void setEmployeeId(int employeeId) {
		this.employeeId = employeeId;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getHireDate() {
		return hireDate;
	}

	public void setHireDate(String hireDate) {
		this.hireDate = hireDate;
	}

	public String getJobId() {
		return jobId;
	}

	public void setJobId(String jobId) {
		this.jobId = jobId;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	@Override
	public String toString() {
		return "Employee [employeeId=" + employeeId + ", firstname=" + firstname + ", lastname=" + lastname + ", email="
				+ email + ", phoneNumber=" + phoneNumber + ", hireDate=" + hireDate + ", jobId=" + jobId + ", salary="
				+ salary + "]";
	}

//	@Override
//	public int compareTo(Employee o) {
//		return o.salary - this.salary; // -1: 오름차순, +1: 내림차순, 0: 동일
//	} // salary기준으로 set값 저장
	
	@Override
	public int compareTo(Employee o) {
		return o.firstname.compareTo(this.firstname); // -1: 오름차순, +1: 내림차순, 0: 동일
	} // firstName기준으로 set값 저장


}
