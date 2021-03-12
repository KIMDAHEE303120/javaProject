package collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
	public static void main(String[] args) {
		String[] strAry = new String[10];// null값이 디폴트로 들어가있음
		strAry[0] = "Hello";
		strAry[1] = "World";
		strAry[4] = "Nice";
//		for (int i = 0; i < strAry.length; i++) {
//			if (strAry[i] != null) {
//				System.out.println(strAry[i]);
//			}
//		}

		List<Integer> numList = new ArrayList<>();
		numList.add(10);
		numList.add(20);
		numList.get(0);

		List<String> strList = new ArrayList<>(); // List
		strList.add("Hello"); // add는 모든타입의 객체를 받을 수 있음(object)
		strList.add("Nice");
		strList.add("Good");
		strList.add(0, "Very"); // 컬렉션의 값을 0으로 지정 하겠다... 0=very, 1=hello,2=nice,3=good이 됨

		for (int i = 0; i < strList.size(); i++) {
			strList.get(i);
		}

		System.out.println(strList.size());
		strList.remove(2);
		System.out.println(strList.size());

//		for(int i=0; i<50; i++) {  >>>여러개의 값을 저장할 수 있음을 보여줌 
//			strList.add(String.valueOf(i));
//		}
		for (Object obj : strList) {
			String str = (String) obj;
			System.out.println(str); // 1번은 논리적으로 같음= true/2.false/3.int 타입이라서 에러
		}

	}

}
