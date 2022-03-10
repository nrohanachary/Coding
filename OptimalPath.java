package practice;

import java.io.*;
import java.util.*;

class OptimalPath {

	public static Integer optimalPath(Integer[][] grid)
  {
	int[][] x = new int[grid.length][grid[0].length];	
	  for(int i = grid.length-1; i>=0; i-- ) {
		  for(int j = 0; j< grid[0].length ; j ++) {
			  if (i == grid.length-1 && j == 0) {
				  x[i][j] = grid[i][j];
			  }
			  else if(j == 0) {
				  x[i][j] = grid[i][j] + x[i+1][j];
			  }
			  else if(i == grid.length-1) {
				  x[i][j] = grid[i][j] + x[i][j-1];
			  }
			  else {
				  x[i][j] = grid[i][j] + Math.max(x[i][j-1] , x[i+1][j]);
			  }
		  }
	  }
	  int collect =  x[0][x[0].length-1];
	  System.out.println(collect);
	  return collect;
  }

	public static boolean doTestsPass() {
		boolean result = true;
		result &= optimalPath(new Integer[][] { { 0, 0, 0, 3, 5 }, { 0, 1, 1, 1, 8 }, { 2, 0, 0, 0, 0 } }) == 18;
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
