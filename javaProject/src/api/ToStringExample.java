package api;

//object 예제
//objects 예제 p.480

import java.util.Date;
import java.util.Objects;

public class ToStringExample {
	public static void main(String[] args) {
		
//		Object obj1 = new Object();
//		Date obj2 = new Date();
//		System.out.println(obj1.toString());
//		System.out.println(obj2.toString());
//--------------------------------------------------
		
		String str1 = "홍길동";
		String str2 = null;		
		System.out.println(Objects.toString(str1));
		System.out.println(Objects.toString(str2));
		System.out.println(Objects.toString(str2, "이름이 없습니다."));
		
	}

}
