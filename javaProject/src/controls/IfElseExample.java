package controls;

public class IfElseExample {
	public static void main(String[] args) {
		String grade = "F";
		int score = 84;

		// if, else ����ؼ� 90�� �̻�=A/ 80�� �̻�=B/70�� �̻�=C/�� ��=F
		// ���� 85�� B�Դϴ�. ���

		if (score >= 90) {
			grade = "A";
		} else if (score >= 80) {
			grade = "B";
		} else if (score >= 70) {
			grade = "C";
		} else {
			grade = "F";
		}
		System.out.println("���� " + score + "���� " + grade + "�Դϴ�.");

//		
//		if (score >= 90) { 
//			System.out.println("���� " + score + "���� A�Դϴ�." );
//		} else if (score >= 80) {
//			System.out.println("���� " + score + "���� B�Դϴ�." );
//		} else if (score >= 70) {
//			System.out.println("���� " + score + "���� C�Դϴ�." );
//		} else {
//			System.out.println("���� " + score + "���� F�Դϴ�." );
//		}

		// if�����ȿ� if, else �ֱ�
		// 95���̻��� A+ ,...
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
		System.out.println("���� " + score + "���� " + grade + "�Դϴ�.");

		
		
		//switch ���� �����
		
		switch (score/10) {
		case 9: grade = "A"; break;

		case 8: grade = "B"; break;
	
		case 7: grade = "C"; break;
		
		default : grade = "F";
	
		}
		System.out.println("���� " + score + "���� " + grade + "�Դϴ�.");

	}

}
