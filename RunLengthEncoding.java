package practice;

public class RunLengthEncoding {
	public static String rle(String input) {
		// Your code goes here
		if(input.length() == 0) {
			return "";
		}
		String op = "";
		char ch = input.charAt(0);
		int len = 1;
		for(int i=1; i <input.length(); i++) {
			if(ch == input.charAt(i)) {
				len++;
			}
			else {
				op = op + ch + len;
				ch = input.charAt(i);
				len = 1;
			}
		}
		op = op + ch + len;
		System.out.println(op);
		return op;
	}

	public static void main(String[] args) {

		if ("".equals(rle("")) && "a1".equals(rle("a")) && "a3b3".equals(rle("aaabbb")) && "a3b3c1".equals(rle("aaabbbc"))) {
			System.out.println("Passed");
		} else {
			System.out.println("Failed");
		}
	}
}
