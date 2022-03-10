package practice;

public class SquareRoot {
	/*
	 * double squareRoot( double x )
	 *
	 */

	public static double squareRoot(double x) {
		for (double i = 1.0; i <= x; i++) {
			if (i * i == x) {
				return i;
			} else if (i * i > x) {
				return helper(i - 1, i, x);
			}
		}
		return x;
	}

	public static double helper(double low, double high, double target) {
		double mid = (low + high) / 2;
		double threshold = 0.00001;
		double mul = mid*mid;
		if (mul == target || Math.abs(target - mul)<= threshold) {
			System.out.println(mid);
			return mid;
		} else if (mul > target) {
			return helper(low, mid, target);
		} else {
			return helper(mid, high, target);
		}
	}

	public static void main(String args[]) {
		double[] inputs = { 2, 4, 100, 5 };
		double[] expected_values = { 1.41421, 2, 10, 2.23606 };
		double threshold = 0.00001;
		for (int i = 0; i < inputs.length; i++) {
			if (Math.abs(squareRoot(inputs[i]) - expected_values[i]) > threshold) {
				System.out.printf("Test failed for %f, expected=%f, actual=%f\n", inputs[i], expected_values[i],
						squareRoot(inputs[i]));
			}
		}
		System.out.println("All tests passed");
	}
}