package controls;

public class Morning0225 {
	public static void main(String[] args) {
		//11~30까지의 수의 합을 구하도록 for 반복문
		//11~30을 변수로 입력받아서 합을 구하는 for 반복문
		//11~30을 매개변수로 받아서 합을 구하는 메소드
		 
		int sum1 = 0;
		for (int i=11; i<=30;i++) {
			sum1 = sum1 + i;}
		System.out.println("1) 11~30까지의 합: " + sum1);
		// end 1)
		
		int sum = 0;
		int result = getSum(11, 30);		
				System.out.println("2) 11~30까지의 합: " + result );
	
	}   //end of main

	
	public static int getSum(int fromValue, int toValue) {
		int sum = 0;		
		for (int i=fromValue; i<=toValue;i++) {
			sum = sum + i;		
		}
		
		return sum;
	}
	
}
