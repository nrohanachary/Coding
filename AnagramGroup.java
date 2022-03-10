package practice;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AnagramGroup {

	static String input = "cat dog tac sat tas god dog";

	static void setOfAnagrams(String inputString) {
		Map<String, List<String>> h = new LinkedHashMap();
		String str[] = inputString.split("[,. ?]");
		for (String st : str) {
			char chararray[] = st.toCharArray();
			Arrays.sort(chararray);
			String sp = new String(chararray);

			if (!h.containsKey(sp)) {
				List<String> word = new ArrayList();
				word.add(st);
				h.put(sp, word);

			} else {
				h.get(sp).add(st);

			}

		}

		h.forEach((k, v) -> {
			for (String string : v) {
				System.out.print(" " + string);
			}
		});

	}

	public static void main(String[] args) {

		String input = "cat dog tac sat tas god dog";
		setOfAnagrams(input);

	}

}
