package practice;

import java.io.*;
import java.util.*;

public class SubArrayExceedingSum
{
  public static int subArrayExceedsSum(int arr[], int target )
  {
	  int result = arr.length + 1;
	  for(int i = 0; i<arr.length; i++) {
		  int sum = 0;
		  for(int j = i; j<arr.length; j++) {
			  sum += arr[j];
		  }
		  if((sum > target) && (arr.length - i)< result) {
			  result = arr.length - i;
		  }
	  }
	  System.out.println(result);
	  return result>arr.length ? -1 : result;
  }

  /**
   * Execution entry point.
  */
  public static void main(String[] args)
  {
   boolean result = true; 
  int[] arr = { 1, 2, 3, 4, 7};
  result = result && subArrayExceedsSum( arr, 6 ) == 1;
  result = result && subArrayExceedsSum( arr, 30 ) == -1;

  if( result )
  {
    System.out.println("All tests pass\n");
  }
  else
  {
    System.out.println("There are test failures\n");
  }
  }
};
