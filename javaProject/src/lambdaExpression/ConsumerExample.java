package lambdaExpression;

import java.util.function.BiConsumer;
import java.util.function.Consumer;
import java.util.function.DoubleConsumer;
import java.util.function.ObjIntConsumer;

public class ConsumerExample {
	public static void main(String[] args) {

		//람다식으로 선언하기 전 모습(익명의 객체를 구현)
//		Consumer<String> consumer = new Consumer<String>() {
//			@Override
//			public void accept(String t) {
//				System.out.println(t + "8");			
//			}
//		};
//		consumer.accept("java");
		
		Consumer<String> consumer = t -> System.out.println(t + "8");
		consumer.accept("java");
		
		BiConsumer<String, String> bigConsumer = (t, u) -> System.out.println(t + u);
		bigConsumer.accept("java", "8");
		
		DoubleConsumer doubleConsumer = d -> System.out.println("java" + d);
		doubleConsumer.accept(8.0);
		
		ObjIntConsumer<String> objectConsumer = (t, i) -> System.out.println(t + i);
		objectConsumer.accept("java", 8);
	}

}
