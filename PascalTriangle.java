package practice;

/*
**  Below formation is called Pascals Triangle.
**
**  Example:
**               1
**              1 1
**             1 2 1
**            1 3 3 1
**           1 4 6 4 1
**         1 5 10 10 5 1
**        1 6 15 20 15 6 1
**
**  Complete the 'pascal' function below so that given a
**  col and a row it will return the value in that positon.
**
**  Example, pascal(1,2) should return 2
**
*/

/* 
*					******** IMPORTANT ********
*
* THIS IS SAMPLE SOLUTION. IF YOU FIND BETTER SOLUTION PLEASE CONSIDER USING SAME.
* USE YOUR OWN VARIABLE NAMES - @@@ DO NOT COPY @@@ EXACT VARIABLE NAMES
*
*/
import java.util.HashMap;
import java.util.Map;

public class PascalTriangle {

	public static int pascal(int col, int row) {
		int n = col>row? col+1 : row+1;
		int[][] p = new int[n][n];
		for(int i = 0; i<n; i++) {
			for(int j = 0; j<=i; j++) {
				if(j== 0 || j==i) {
					p[i][j] = 1;
				}
				else p[i][j] = p[i-1][j] + p[i-1][j-1];
				
				if(i == row && j == col) {
					return p[i][j];
				}
			}
		}
		System.out.println(p[row][col]);
		return p[row][col];
	}

	public static void main(String[] args) {
		if (PascalTriangle.pascal(0, 0) == 1 && PascalTriangle.pascal(1, 2) == 2 && PascalTriangle.pascal(5, 6) == 6
				&& PascalTriangle.pascal(4, 8) == 70 && PascalTriangle.pascal(6, 6) == 1) {
			System.out.println("Pass");
		} else {
			System.out.println("Failed");
		}
	}
}
