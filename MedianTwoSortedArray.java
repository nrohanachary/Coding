package practice;


//find the median of the two sorted arrays.
// ex. {1, 3} and {2} is 2


public class MedianTwoSortedArray
{

public static double logic(int[] a, int[] b) {
	int i = 0, j=0;
	int lenA = a.length;
	int lenB = b.length;
	int[] c = new int[lenA + lenB];
	int mid = (lenA + lenB)/2;
	int k = 0;
	while(i<lenA || j<lenB) {
		if(a[i] < b[j]) {
			c[k] = a[i];
			i++;
		}
		else {
			c[k] = b[j];
			j++;
		}
		k++;
		if(k > mid) break;
	}
	for(int x= 0; x< c.length ; x++) {
		System.out.println(c[x]);
	}
	if((lenA + lenB)%2 == 0) {
		System.out.println((c[mid] + c[mid-1])/2);
		return (c[mid] + c[mid-1])/2.0;
	}
	else {
		System.out.println(c[mid]);
		return c[mid];
	}
}

public static boolean pass()
{
boolean result = true;
result = result && logic(new int[]{1, 3, 5}, new int[]{2, 4, 6}) == 3.5;
return result;
};

public static void main(String[] args)
{
if(pass())
{
 System.out.println("pass");
}
else
{
 System.out.println("some failures");
}
}
}