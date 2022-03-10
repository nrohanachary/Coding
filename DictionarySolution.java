// Given a a string of letters and a dictionary, the function longestWord should
//     find the longest word or words in the dictionary that can be made from the letters
//     Input: letters = "oet", dictionary = {"to","toe","toes"}
//     Output: {"toe"}
package practice;

import java.util.*;

class Dictionary {
  public String[] entries;

  public Dictionary(String[] entries) {
    this.entries = entries;
  }

  public boolean contains(String word) {
    return Arrays.asList(entries).contains(word);
  }
}

public class DictionarySolution {
  public static Set<String> longestWord(String letters, Dictionary dict) {
    Set<String> result = new HashSet<String>();
    Set<String> result2 = new HashSet<String>();
    int length = 0;
    String[] entries = dict.entries;
    for(int i = 0; i<entries.length; i++) {
    	String s = entries[i];
    	int l = s.length();
    	for(int j = 0; j< letters.length(); j++) {
    		s = s.replaceAll(letters.charAt(j)+"","");
    	}
    	if(s.equals("") && l>=length) {
    		length = l;
    		result.add(entries[i]);
    	}
    }
    for(String s : result) {
    	if(s.length() == length) {
    		result2.add(s);
    		System.out.println(s);
    	}
    }
    return result2;
  }


  public static boolean pass() {
    Dictionary dict = new Dictionary(new String[]{"to", "toe", "toes", "doe", "dog", "god", "dogs", "banana"});
    boolean r = new HashSet<String>(Arrays.asList("toe")).equals(longestWord("oet", dict));
    return r;
  }

  public static void main(String[] args) {
    if(pass()) {
      System.out.println("Pass");
    } else {
      System.err.println("Fails");
    }
  }
}