public static void main (String [] args) {
    int [] A = {9, 5, 4, 3, 2, 1, 34, 53};
    int t = 4;
    int count = 0;
    for (int i = 0;
    i < A.length; i ++) {
        if (A [i] <= t) {
            count ++;
        }
    }
    int [] B = new int [count];
    int [] C = new int [A.length - count];
    for (int i = 0, j = 0, k = 0;
    i < A.length; i ++) {
        if (A [i] <= t) {
            B [j] = A [i];
            System.out.println ("B = " + B [j]);
            j ++;
        } else {
            C [k] = A [i];
            System.out.println ("C = " + C [k]);
            k ++;
        }
    }
}


 
public static void main(String[] args)
{
	int[] A = {9, 5, 4, 3, 2, 1, 34, 53};
    	int threshold = 4;
    	int b_amount = 0; // Amount of B array 
    	int c_amount = 0; // Amount of C array 

    	// Calculate size of B and C 
    	for (int idx = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= threshold)
        	{
            		b_amount++;
        	} else {
            		c_amount++;
        	}
    	}

    	int[] B = new int[b_amount]; // Create B array
    	int[] C = new int[c_amount]; // Create C array

    	// Put the element into two array
    	for (int idx = 0, first_idx = 0, second_idx = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= threshold)
        	{
            		B[first_idx] = A[idx];
            		System.out.println("B = " + B[first_idx]);
            		first_idx++;
        	} else {
            		C[second_idx] = A[idx];
            		System.out.println("C = " + C[second_idx]);
            		second_idx++;
        	}
    	}
}
