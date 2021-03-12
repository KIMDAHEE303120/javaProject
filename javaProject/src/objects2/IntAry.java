package objects2;

import java.util.ArrayList;
import java.util.Arrays;

import com.sun.tools.javac.util.List;

public class IntAry {
	public static void main(String[] args) {

		int[] intAry = null;
		intAry = new int[] { 4, 8, 3 };
//		Arrays.sort(intAry);
//
//		for (int i = 0; i < intAry.length; i++) {
//			System.out.print(intAry[i] + "/");
//		}
		int highAry = 0;
		int nextAry = 0;
		for (int i = 0; i < intAry.length; i++) {
			if (intAry[i] > highAry) {
				highAry = intAry[i];
			}
			for (int j = 0; j < intAry.length; j++) {
				if (intAry[j] > nextAry) {
					nextAry = intAry[j];

				}
			}
			System.out.println(highAry);
		}

		// 컬렉션으로 비교
//		List<Integer> aList = new ArrayList<>();
//		aList.add(3);
//		aList.add(8);
//		aList.add(4);
//		int temp = 0;
//
//		for (int i = 0; i < aList.size() - 1; i++) {
//			if (aList.get(0) > aList.get(1)) {
//				temp = aList.get(0);
//				aList.set(0, aList.get(1));
//				aList.set(1, temp);
//
//			}
//		}
//		for (Integer i : )
	}
}
