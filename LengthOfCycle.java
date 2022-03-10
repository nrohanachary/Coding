package practice;

import java.util.Map;
import java.util.HashMap;

public class LengthOfCycle {

	/**
	 *
	 * You have an integer array. Starting from arr[startIndex], follow each element
	 * to the index it points to. Continue to do this until you find a cycle. Return
	 * the length of the cycle. If no cycle is found return -1
	 *
	 */
	public static int countLengthOfCycle(int[] arr, int startIndex) {
		// your code goes here
		int slow = arr[startIndex];
		int fast = arr[slow];
		int cycle = startIndex;
		while (fast != slow) {
			if (slow >= arr.length)
				return -1;
			slow = arr[slow];
			if (fast >= arr.length)
				return -1;
			fast = arr[fast];
			if (fast >= arr.length)
				return -1;
			fast = arr[fast];
		}
		cycle = fast;
		int[] visited = new int[arr.length];
		int length = 0;
		while(visited[cycle] != 1) {
			visited[cycle] = 1;
			cycle = arr[cycle];
			length++;
		}
		return length;
	}

	public static void main(String[] args) {

		boolean testsPassed = true;

		testsPassed &= countLengthOfCycle(new int[] { 1, 0 }, 0) == 2;
		testsPassed &= countLengthOfCycle(new int[] { 1, 2, 0 }, 0) == 3;
		testsPassed &= countLengthOfCycle(new int[] { 1, 2, 3 }, 0) == -1;
		testsPassed &= countLengthOfCycle(new int[] { 1, 2, 3, 4, 5, 6, 4 }, 0) == 3;

		if (testsPassed) {
			System.out.println("Test passed.");
			// return true;
		} else {
			System.out.println("Test failed.");
			// return false;
		}

	}
}
