package controls;

public class SwitchExample {
	public static void main(String[] args) {
		//임의의 숫자를 만들어주는 메소드
//		for (int i=0; i<5; i++) {
//			int z = (int) (Math.random() * 5) + 1;
//			System.out.println(z); //0~5 사이의 임의수
//			}
	
		String msg = "짝수/홀수";
		int z = (int) (Math.random() * 6) + 1;
		switch(z) {
		case 1:  
		case 2: 
		case 3: msg = "홀수"; break;
		case 4: 
		case 5: 
		case 6: msg = "짝수"; break;
		}
		System.out.println(z + "(은)는 " + msg + "입니다.");
	}
}

