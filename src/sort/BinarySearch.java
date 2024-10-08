package sort;

import java.util.Arrays;

public class BinarySearch {

	public static void main(String[] args) {
		int[] list = {10, 98, 38, 28, 12, 9, 88, 77};

		System.out.println(Arrays.toString(sort(list)));
		System.out.println(binarySearch(28 , list));
	}

	public static int binarySearch(int target, int[] list) {
		int[] sortedArray = sort(list);
		int left = 0;
		int right = sortedArray.length - 1;
		while (left <= right) {
			int mid = left + (right - left) / 2;

			if (sortedArray[mid] == target) {
				return mid;
			} else if (sortedArray[mid] < target) {
				left = mid + 1;
			} else {
				right = mid - 1;
			}
		}
		return -1;
	}

	public static int[] sort(int[] list) {
		return Arrays.stream(list).sorted().toArray();
	}

}
