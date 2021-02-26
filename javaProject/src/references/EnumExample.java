package references;

import java.util.Calendar;

enum Kind {
	MALE, FEMALE;
}
enum Choice {
	YES, NO;
}

public class EnumExample {
	public static void main(String[] args) {
		
		int maleOrfemale = 1;
		int yesOrno = 1;
		
		Week today = null;
		today = Week.SUNDAY;
		Calendar cal = Calendar.getInstance();
		System.out.println("년도 " + cal.get(Calendar.YEAR));
		System.out.println("월 " + cal.get(Calendar.MONTH)); //0부터 시작해서 1로 출력됨
		System.out.println("일 " + cal.get(Calendar.DAY_OF_MONTH));
		System.out.println("요일 " + cal.get(Calendar.DAY_OF_WEEK)); //숫자로 나옴,,금요일은 6
		//Week 타입의 데이터를 지정해서 사용하고 싶을 때> Enum에 만들어서 ...
		
		
		//열거타입과 열거상수 p.176 
		int week = cal.get(Calendar.DAY_OF_WEEK);
		switch(week) {
		case 1:
			today = Week.SUNDAY; break;
		case 2:
			today = Week.MONDAY; break;
		case 3:
			today = Week.TUESDAY; break;
		case 4:
			today = Week.WEDNESDAY; break;
		case 5:
			today = Week.THURSDAY; break;
		case 6:
			today = Week.FRIDAY; break;
		case 7:
			today = Week.SATURDAY; break;
		}
		
		System.out.println("오늘은 " + today);
		
		if(today == Week.SUNDAY || today == Week.SATURDAY) { //if(week == 1 | week == 2)로 적어도 되는데,,
			System.out.println("주말에는 여행을 갑니다.");
		} else {
			System.out.println("주중에는 공부를 합니다.");
		}
		Kind manOrwoman = Kind.FEMALE;
		if(manOrwoman == Kind.MALE) {
			System.out.println("남성입니다.");
		} else if(manOrwoman == Kind.FEMALE) {
			System.out.println("여성입니다.");
		}
		
	}

}
