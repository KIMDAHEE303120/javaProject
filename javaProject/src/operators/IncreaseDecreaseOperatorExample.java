package operators;

public class IncreaseDecreaseOperatorExample {
	public static void main(String[] args) {
		int x = 10;
		int y = 10;
		int z;
		System.out.println(x++);//10 > x의 값을 출력한 다음 1을 더하기 때문에 10이 출력
		System.out.println(++x);//12
		System.out.println(x);//12
		System.out.println("--------------------");
		z = ++x + y++; // x: 13, y: 11 < z = +연산을 한 후 y에 1을 더하기 때문에 z는 23이 됨 
					   //24를 만들고 싶으면 "z = ++x + ++y; 해줘야함 
		System.out.println("z: " + z + " ,x: " + x +", y: " + y);
		
	}

}
