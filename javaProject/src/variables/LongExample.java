package variables;

public class LongExample {
	public static void main(String[] args) {
		long var1 = 10;
		long var2 = 10L;
//		long var3 = 10000000000; 정수범위를 넘어었기 때문에 L(long)을 적어줘야 오류x
		long var4 = 10000000000L;
		
		System.out.println(var1);
		System.out.println(var2);
//		System.out.println(var3); 
		System.out.println(var4);
	}

	
	
}
