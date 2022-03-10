package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class LongestSubString {
	private static final Map<String, int[]> testCases = new HashMap<String, int[]>();

	static int[] longestUniformSubstring(String input){
	    int longestStart = -1;
	    int longestLength = 0;

	    // your code goes here
	    if(input != null && input.length()>0) {
	    	char ch = input.charAt(0);
	    	int startIndex = 0;
	    	
		    for(int i = 0; i< input.length(); i++) {
		    	char ch1 = input.charAt(i);
		    	if(ch1 == ch) {
		    		continue;
		    	}
		    	else {
		    		ch = ch1;
		    		if(i-startIndex > longestLength) {
		    			longestLength = i- startIndex;
		    			longestStart = startIndex;
		    			startIndex = i;
		    		}
		    		else startIndex = i;
		    	}
		    }
		    if(input.length() - startIndex > longestLength) {
		    	longestLength = input.length() - startIndex;
		    	longestStart = startIndex;
		    }
		    
	    }
	    return new int[]{ longestStart, longestLength };
	  }

	public static void main(String[] args) {
		testCases.put("", new int[] { -1, 0 });
		testCases.put("10000111", new int[] { 1, 4 });
		testCases.put("aabbbbbCdAA", new int[] { 2, 5 });
		testCases.put("     ", new int[] { 0, 5 });

		boolean pass = true;
		for (Map.Entry<String, int[]> testCase : testCases.entrySet()) {
			int[] result = longestUniformSubstring(testCase.getKey());
			pass = pass && (Arrays.equals(result, testCase.getValue()));
		}
		if (pass) {
			System.out.println("Pass!");
		} else {
			System.out.println("Failed! ");
		}
	}

}
