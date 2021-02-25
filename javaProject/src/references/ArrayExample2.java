package references;

public class ArrayExample2 {
		public static void main(String[] args) {
			int[] intArys = new int[10];
			
			//임의의 값(1~100사이) 전체 합, 평균, 짝수의 합, 평균(if count 사용)
			int sum = 0; 
			double avg = 0.0;	
			int num1 = 0;
			double avgn = 0.0;
			int count = 0;
			
			System.out.println("임의의 값: ");
			
			for (int i = 0; i < intArys.length; i++) {
				intArys[i] = (int) (Math.random() * 100) + 1;			
				System.out.print(intArys[i] + " ");
				
				sum = sum + intArys[i];	
				
				if (intArys[i]%2==0) {
					num1 = num1 + intArys[i];
					count++;
				} 							
			}
			
			avg = (double)sum/intArys.length;
			avgn = (double) num1/count;

			System.out.println("\n총    합: " + sum);
			System.out.println("평    균: " + avg);
			System.out.println("짝 수 합: " + num1);
			System.out.println("짝수 평균: " + avgn);
			
		}

	}

