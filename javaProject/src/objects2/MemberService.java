package objects2;

public class MemberService {

	// 필드
	String id;
	String password;

	// 생성자

	// 메소드

	public boolean login(String id, String password) {
		if (id == "hong" && password == "12345") {
			return true;
		} else {
			return false;
		}

	}

	public void logout(String id) {
		System.out.println("로그아웃 되었습니다.");
	}

}