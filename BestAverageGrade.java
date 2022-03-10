package practice;

import java.util.Arrays;
import java.util.HashMap;

public class BestAverageGrade {
	public static Integer bestAvgGrade(String[][] scores)
	  {
	    // write your code goes here
		HashMap<String , Double> map = new HashMap<String, Double>();
		HashMap<String , Double> map2 = new HashMap<String, Double>();
		for(int i = 0 ; i<scores.length ; i++) {
			if(map.containsKey(scores[i][0])) {
				Double sum = Double.valueOf(scores[i][1]) + map.get(scores[i][0]);
				map.put(scores[i][0], sum);
				Double count = Double.valueOf(map2.get(scores[i][0])) + 1.0;
				map2.put(scores[i][0], count);
			}
			else {
				map.put(scores[i][0], Double.valueOf(scores[i][1]));
				map2.put(scores[i][0], 1.0);
			}
		}
		Double highest = Double.NEGATIVE_INFINITY;
		for(String k : map.keySet()) {
			Double avg = map.get(k)/map2.get(k);
			if(avg > highest) {
				if(avg < 0) {
					highest = Math.floor(avg);
				}
				else {
					highest = Math.ceil(avg);
				}
			}
		}
//		Object[] o = new Object[3];
//		o[1] = new StringBuffer("Hi"); o[2] = 23;
//		System.out.println("Object Array is : " + Arrays.toString(o));
//		System.out.println(Arrays.toString("i am done".split("")));
//		System.out.println("123".substring(0,0));
		System.out.println(highest);
	    return highest.intValue();
	  }

	  public static boolean pass()
	  {
	    String[][] s1 = { { "Rohan", "-84" },
	               { "Sachin", "-66" },
//	               { "Ishan", "55" },
	               { "Sachin", "-65" } };

	    return bestAvgGrade(s1) == -66;
	  }

	  public static void main(String[] args)
	  {
	    if(pass())
	    {
	      System.out.println("Pass");
	    }
	    else
	    {
	      System.out.println("Some Fail");
	    }
	  }
}
