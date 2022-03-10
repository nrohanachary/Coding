package practice;

import java.io.*;
import java.util.*;

class OptimalPathNew {

	public static Integer optimalPath(Integer[][] grid) {
		int row = grid.length - 1;
		int column = 0;
		int sum = optimalPath(grid, row, column);
		System.out.println(sum);
		return sum;
	}

	public static int optimalPath(Integer[][] grid, Integer row, Integer column) {
		if(row == 0 && column == grid[0].length-1) {
			return grid[row][column];
		}
		else {
			int up = 0;
			int right = 0;
			if(row > 0) {
				up = optimalPath(grid, row-1, column);
			}
			if(column < grid[0].length-1) {
				right = optimalPath(grid, row, column+1);
			}
			return grid[row][column] + Math.max(up, right);
		}
	}

	public static boolean doTestsPass() {
		boolean result = true;
		result &= optimalPath(new Integer[][] { { 20, 0, 0, 3, 5 }, { 0, 1, 1, 1, 8 }, { 2, 0, 0, 0, 0 } }) == 30;
		return result;
	}

	public static void main(String[] args) {
		if (doTestsPass()) {
			System.out.println("All tests pass");
		} else {
			System.out.println("Tests fail.");
		}
	}
}
