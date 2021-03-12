package collections;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
	public static void main(String[] args) {
		// 1) array list가 처리하는데 걸리는 시간
		List<String> list = new ArrayList<>();
		
		long startTime, endTime;
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime));
		
		
		// 2) linked list가 처리하는데 걸리는 시간
		list = new LinkedList<>();
		startTime = System.nanoTime();
		for(int i=0; i<100000; i++) {
			list.add(String.valueOf(i));
		}
		endTime = System.nanoTime();
		System.out.println("걸린 시간: " + (endTime - startTime));

		
	}

}
