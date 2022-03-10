package practice;

public class AddFraction {

	  /**
	   * Given two fractions passed in as int arrays,
	   * returns the fraction which is result of adding the two input fractions.
	   */
	  public static int[] addFractions( int[] fraction1, int[] fraction2 ) {
	    // Write your code here
		  int num = (fraction1[0] * fraction2[1]) + (fraction2[0] * fraction1[1]);
		  int den = fraction1[1] * fraction2[1];
		  int hcf = hcf(num, den);
		  System.out.println(hcf);
		  System.out.println(num/hcf + " | " + den/hcf);
		  return (new int[]{num/hcf, den/hcf});
	  }
	  
	  public static int hcf(int num, int den) {
		  if(num == 0) return den;
		  if(den == 0) return num;
		  if(num == den) return num;
		  if(num > den) return hcf(num-den, den);
		  else return hcf(num, den-num);
	  }

	  
	  public static void main( String[] args ) {
	    int[] result = addFractions( new int[]{ 5, 9 }, new int[]{ 7, 12 } );

	    if( result[ 0 ] == 41 && result[ 1 ] == 36 ) {
	      System.out.println( "Test passed." );
	    } else {
	      System.out.println( "Test failed." );
	    }
	  }
	}