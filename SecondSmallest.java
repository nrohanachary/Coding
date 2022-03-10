package practice;

public class SecondSmallest {
	/**
	 * int secondSmallest(int[] x)
	 */
	public static int secondSmallest(int[] x) {
		if(x.length == 1) return x[0];
		for(int i = 0; i<= 1; i++) {
			for(int j = i+1; j<x.length; j++) {
				if(x[i] > x[j]) {
					int temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
		}
		return x[1];
				
	}

	public static void main(String args[]) {

		int[] a = { 0 ,6,1,0};
		int[] b = { 0, 3,4,2 };

		boolean result = true;
		result &= secondSmallest(a) == 0;
		result &= secondSmallest(b) == 2;

		if (result) {
			System.out.println("Pass");
		} else {
			System.out.println("Fail");
		}

	}

}
