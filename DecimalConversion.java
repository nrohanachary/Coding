package practice;

import java.util.HashMap;

public class DecimalConversion {
	/**
	 * Return the fraction output in the following way Examples: If after decimal,
	 * repeating numbers are there in the output . eg. 1/3=0.333333333, this should
	 * be represented as 0.(3) 6/11=0.54545454, this should be represented as 0.(54)
	 * fractionRepresentation(1,2)=0.5 fractionRepresentation(1,3)=0.(3)
	 * fractionRepresentation(6,11)=0.(54)
	 */
	public static String fractionRepresentation(int num, int den) {
		if (num == 0) {
			return "0";
		}
		if (den == 0) {
			return "";
		}
		StringBuffer sb = new StringBuffer("");
		int quo = num / den;
		int rem = (num % den) * 10;
		if (rem == 0) {
			sb.append(String.valueOf(quo));
		} else {
			sb.append(String.valueOf(quo));
			sb.append(".");
		}
		HashMap<Integer, Integer> hm = new HashMap<>();
		while (rem != 0) {
			if (hm.containsKey(rem)) {
				int index = hm.get(rem);
				String part1 = sb.substring(0, index);
				String part2 = "(" + sb.substring(index, sb.length()) + ")";
				return part1 + part2;
			}
			hm.put(rem, sb.length());
			quo = rem / den;
			sb.append(String.valueOf(quo));
			rem = rem % den * 10;

		}
		return sb.toString();
	}

	public static void main(String args[]) {
		// float f=6/11f;
		// System.out.println(f);
		System.out.println(fractionRepresentation(22, 7) + " " + fractionRepresentation(1, 3) + " "
				+ fractionRepresentation(6, 11));

		if (fractionRepresentation(22, 7).equals("0.223223") && fractionRepresentation(6, 11).equals("0.(54)")
				&& fractionRepresentation(1, 3).equals("0.(3)")) {
			System.out.println("All passed");
		} else {
			System.out.println("Failed");
		}

	}
}
