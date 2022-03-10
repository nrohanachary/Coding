package practice;

import java.util.Arrays;

public class FindMinimumNumber {
	/*
	 * public static int FindMin(int a[]) Returns the smallest number in array that
	 * has been rotated For example - Array {3,4,5,6,1,2} returns 1
	 */

	public static int FindMin(int a[]) {

		if (a.length == 0 || a == null) {
            return -1;
        }
        int start = 0;
        int last = a.length - 1;
        while (start + 1 < last) {
            int mid = start + (last - start) / 2;
            int m = a[mid];
            int s = a[start];
            int l = a[last];

            if (m > l) {
                start = mid + 1;
            }
            if (m < l) {
                last = mid;
            } else {
                last--;
            }

        } // while

        if (a[start] > a[last]) {
            return a[last];
        } else {
            return a[start];
        }
	}

	public static void main(String args[]) {
		boolean result = true;
		result = result && FindMin(new int[] { 3, 4, 5, 6, 1, 2 }) == 1;
		result = result && FindMin(new int[] { 2, 1 }) == 1;
		result = result && FindMin(new int[] { 6,7,8,9,4,5 }) == 4;
		result = result && FindMin(new int[] { 1 }) == 1;

		try {
			FindMin(null);
			result = false;
		} catch (Exception e) {
			result = result && true;
		}

		if (result) {
			System.out.println("All tests pass");
		} else {
			System.out.println("There are test failures");
		}
	}
}
