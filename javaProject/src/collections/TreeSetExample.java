package collections;

import java.util.Iterator;
import java.util.NavigableSet;
import java.util.TreeSet;

public class TreeSetExample {
	public static void main(String[] args) {
		TreeSet<Integer> scores = new TreeSet<>();
		scores.add(new Integer(87));
		scores.add(new Integer(98));
		scores.add(new Integer(75));
		scores.add(new Integer(85));
		scores.add(new Integer(80)); // TreeSet은 기본적으로 값을 sort

		Iterator<Integer> iter = scores.iterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---내림차순");
		iter = scores.descendingIterator();
		while (iter.hasNext()) {
			System.out.println(iter.next());
		}
		System.out.println("---내림차순");	
		NavigableSet<Integer> nSet = scores.descendingSet();
		for(Integer i : nSet) {
			System.out.println(i);
		}
		
		
		Integer score = null;

		score = scores.first();
		System.out.println("가장 낮은 점수: " + score);

		score = scores.last();
		System.out.println("가장 높은 점수: " + score + "\n");

		score = scores.lower(new Integer(95));
		System.out.println("95점 아래 점수: " + score);

		score = scores.higher(new Integer(95));
		System.out.println("95점 위의 점수: " + score + "\n");

		score = scores.floor(new Integer(95));
		System.out.println("95점 이거나 바로 아래 점수: " + score);

		score = scores.ceiling(new Integer(85));
		System.out.println("85점 이거나 바로 위의 점수: " + score + "\n");

		while (!scores.isEmpty()) {
			score = scores.pollFirst();
			System.out.println(score + "(남은 객체 수: " + scores.size() + ")");

		}

	}

}
