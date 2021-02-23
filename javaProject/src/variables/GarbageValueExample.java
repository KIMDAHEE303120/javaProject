package variables;

public class GarbageValueExample {
	public static void main(String[] args) {
		byte var1 = 125;
		int var2 = 125;
		for(int i=0; i<5; i++) { //i의 값에다 +1을 하되, i가 5보다 작을때 까지 증가시키라는 의미(=5번 반복)
			var1++;//1씩 증가하라는 의미
			var2++;//byte 타입으로 연산됨
			System.out.println("var1: " + var1 + "\t" + "var2: " + var2);//tab
			
//			var1 = byte = -128~127
//			01111111 = 127
//			10000000 = -128 
//			^ 
//			앞자리는 부호 (+/-)
			
						
		}
		
	}

}
