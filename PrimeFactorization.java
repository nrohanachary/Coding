package practice;

import java.util.ArrayList;

public class PrimeFactorization {
	/**
	   * Return an array containing prime numbers whose product is x
	   * Examples:
	   * primeFactorization( 6 ) == [2,3]
	   * primeFactorization( 5 ) == [5]
	   */
public static ArrayList<Integer> primeFactorization(int x)
{
	ArrayList<Integer> op = new ArrayList<Integer>();
	for(int i = 2; i<= x; i++) {
		while(x%i == 0) {
			op.add(i);
			x= x/i;
		}
	}
	return op;
}

public static void main(String args[])
{
	System.out.println(primeFactorization(45)); 
}
}
