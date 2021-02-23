package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade = "F";
		int score = 84;

		// if, else 사용해서 90점 이상=A/ 80점 이상=B/70점 이상=C/그 외=F
		// 점수 85는 B입니다. 출력

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("점수 " + score + "점은 " + grade + "입니다.");

//		
//		if (score >= 90) { 
//			System.out.println("점수 " + score + "점은 A입니다." );
//		} else if (score >= 80) {
//			System.out.println("점수 " + score + "점은 B입니다." );
//		} else if (score >= 70) {
//			System.out.println("점수 " + score + "점은 C입니다." );
//		} else {
//			System.out.println("점수 " + score + "점은 F입니다." );
//		}

		// if구문안에 if, else 넣기
		// 95점이상은 A+ ,...
		if (score >= 90) {			
			if (score >= 95) {
				grade = "A+";
			} else {
				grade = "A";
			}
		} else if (score >= 80) {
			if (score >= 85) {
				grade = "B+";
			} else {
				grade = "B";
			}
		} else if (score >= 70) {
			if (score >= 75) {
				grade = "C+";
			}else {
				grade = "C";
			}
		} else {
			grade = "F";
		}
		System.out.println("점수 " + score + "점은 " + grade + "입니다.");

		
		
		//switch 구문 만들기
		
		switch (score/10) {
		case 9: grade = "A"; break;

		case 8: grade = "B"; break;
	
		case 7: grade = "C"; break;
		
		default : grade = "F";
	
		}
		System.out.println("점수 " + score + "점은 " + grade + "입니다.");

	}

}
