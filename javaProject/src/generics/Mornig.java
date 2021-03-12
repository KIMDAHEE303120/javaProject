package generics;

import java.util.HashMap;

public class Mornig {
	public static void main(String[] args) {
		// 주민번호 1,3=남자/2,4=여자
//		System.out.println(checkGender("012345-1234567"));
//		System.out.println(checkGender("012345-2234567"));
//		System.out.println(checkGender("012345-4234567"));
//		System.out.println(checkGender("012345-3234567"));
//		
//		public static String checkGender(String j) {
//			String[] rep = { "/", "-", "*", "=" };
//			String r = j;
//			for (String str : rep) {
//				r = r.replace(str, "");
//			}
//
//			if (r.charAt(6) == '1' || r.charAt(6) == '3') {
//				return "남자";
//			} else if (r.charAt(6) == '2' || r.charAt(6) == '4') {
//				return "여자";
//			}
//			return "";
//		 }

		// 두 수의 합을 구하고 합의 결과를 천단위(,)표시
		sum("10000", "23400");

	}
	public static void sum(String a, String b) {
		String sum1 = String.valueOf(Integer.parseInt(a));
		String sum2 = String.valueOf(Integer.parseInt(b));
		
		System.out.println(sum1+sum2);
	}

}
