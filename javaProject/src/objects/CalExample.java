package objects;

public class CalExample {
	public static void main(String[] args) {
		System.out.println(getSum(40, 50));
		
		System.out.println(getAverage(40, 50));

		Student2 s = new Student2("박소연" , 87, 92);
		showinfo(s);
	}

	public static void showinfo(Student2 st) { // 매개변수 다양
		System.out.println("이름: " + st.getName());
		System.out.println("합계점수: " + getSum(st.getEng(), st.getMath()));
		System.out.println("평균점수: " + getAverage(st.getEng(), st.getMath()));
	}

	public static int getSum(int num1, int num2) { // 반환타입은 int 매개타입은
		int sum = num1 + num2;
		return sum;
	}

	public static double getAverage(int a, int b) { // double타입
		int sum = a + b;
		double avg = sum / 2.0;
		return avg;
	}
}
