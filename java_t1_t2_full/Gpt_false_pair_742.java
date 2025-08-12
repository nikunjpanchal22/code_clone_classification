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
    	int upper_lim = 4;
    	int count_b = 0; // Count for B array 
    	int count_c = 0; // Count for C array 

    	// Calculate size of B and C 
    	for (int idx = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= upper_lim)
        	{
            		count_b++;
        	} else {
            		count_c++;
        	}
    	}

    	int[] B = new int[count_b]; // Create B array
    	int[] C = new int[count_c]; // Create C array

    	// Put the element into two array
    	for (int idx = 0, b_idx = 0, c_idx = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= upper_lim)
        	{
            		B[b_idx] = A[idx];
            		System.out.println("B = " + B[b_idx]);
            		b_idx++;
        	} else {
            		C[c_idx] = A[idx];
            		System.out.println("C = " + C[c_idx]);
            		c_idx++;
        	}
    	}
}
