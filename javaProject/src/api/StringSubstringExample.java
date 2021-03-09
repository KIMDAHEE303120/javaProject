package api;
//p.507

public class StringSubstringExample {
	public static void main(String[] args) {
		String ssn = "880815-1234567";

		String firstNum = ssn.substring(0, 6); // 0~5까지(0,1,2,3,4,5 = 총 6개 추출)
		System.out.println(firstNum);

		String secondNum = ssn.substring(7); // 7부터 끝까지
		System.out.println(secondNum);
	}

}
