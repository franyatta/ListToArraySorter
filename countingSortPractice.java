/*
 * For those unfamiliar with lists but good with arrays
 * This program will convert the list to array
 * Sorts the array in ascending order
 * Converts it back to the List<Intger>
 * Returns the List<Integer>
 * - franyatta
 */

import java.util.List;
import java.util.ArrayList;

public class countingSortPractice {

	public static void main(String[] args) {
		List<Integer> list2 = new ArrayList<Integer>();
		list2.add(5);
		list2.add(2);
		list2.add(6);
		list2.add(4);
		System.out.println(countingSort(list2));

	}
	public static List<Integer> countingSort(List<Integer> arr) {
		
		Integer[] arr2 = (Integer[])arr.toArray(new Integer[arr.size()]);
		
		for (int i = 0; i < arr.size()-1; i++) {
			int min = i;
			for (int j = i + 1; j < arr.size(); j++) {
				if (arr2[min] > arr2[j]) {
					min = j;
				}
			}
			int temp = arr2[i];
			arr2[i] = arr2[min];
			arr2[min] = temp;
	}
			List<Integer> list = new ArrayList<Integer>();
			for (int a : arr2)
				list.add(a);
			return list;
			}
}
