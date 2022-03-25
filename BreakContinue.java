package hw1exercise1b;

public class BreakContinue {
	/* This is HW1 EX4*/
	  public static void windowPosSum(int[] a, int n) {
		  int index = 0;
		  int j = 0;
		  for(index = 0; index < a.length; index += 1) {
			  ///int sum = 0;
			  if (a[index] < 0) {
				  continue;
			  }
			  int sum = 0;
			  for (j = index; j <= (index+3); j +=1) {
				  if (j == a.length) {
					  break;
				  }
				  sum += a[j];
			  }
			  a[index] = sum;			  
		  }
		  ///System.out.print(a);
	  }

	  public static void main(String[] args) {
	    int[] a = {1, 2, -3, 4, 5, 4};
	    int n = 3;
	    windowPosSum(a, n);
	    // Should print 4, 8, -3, 13, 9, 4
	    int[] a1 = {1, -1, -1, 10, 5, -1};
	    int n1 = 2;
	    windowPosSum(a1,n1);
	    //should print [-1, -1, -1, 14, 4, -1]
	    System.out.println(java.util.Arrays.toString(a));
	    System.out.println(java.util.Arrays.toString(a1));
	  }
	 /*
	 Hint 1: Use two for loops.
	 Hint 2: Use continue to skip negative values.
	 Hint 3: Use break to avoid going over the end of the array.
	 */
	}