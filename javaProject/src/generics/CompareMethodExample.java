package generics;

public class CompareMethodExample {
	public static void main(String[] args) {
		Utils u = new Utils();
		Utils.Pair<Integer, String> p1 = u.new Pair</*integer, string타입이 올것을 알고있음=생략가능*/>(1,"사과");
		Utils.Pair<Integer, String> p2 = u.new Pair<>(1,"사과");
		
		
		boolean result = Utils.compare(p1,p2);
		if (result) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
		
		Utils.Pair<String, String> p3 = u.new Pair<String, String>("user1","홍길동");
		Utils.Pair<String, String> p4 = u.new Pair<String, String>("user2","홍길동");
		boolean result2 = Utils.compare(p3, p4);
		if (result2) {
			System.out.println("논리적으로 동등한 객체입니다.");
		} else {
			System.out.println("논리적으로 동등하지 않은 객체입니다.");
		}
	}

}
