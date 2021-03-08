package api;

import java.util.HashMap;

//hashcode() 메소드

public class KeyExample {
	public static void main(String[] args) {
		// Key 객체를 식별키로 사용해서 String 값을 저장하는 HashMap 객체 생성
		HashMap<Key, String> hashMap = new HashMap<Key, String>();

		// 식별키 "new Key(1)"로 "홍길동"을 저장함
		hashMap.put(new Key(1), "홍길동");

		// 식별키 "new Key(1)"로 "홍길동을 읽어옴
		String value = hashMap.get(new Key(1));
		System.out.println(value);

	}

}

//number의 필드값이 같더라도 hashcode()메소드에서 리턴하는 해시코드가 다르기 때문에 다른 식별키로 인식>>저장된 값을 찾아오지 못함>>'null'출력
