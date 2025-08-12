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
    	int limit = 4;
    	int b_size = 0; // Size of B array 
    	int c_size = 0; // Size of C array 

    	// Calculate size of B and C 
    	for (int idx = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= limit)
        	{
            		b_size++;
        	} else {
            		c_size++;
        	}
    	}

    	int[] B = new int[b_size]; // Create B array
    	int[] C = new int[c_size]; // Create C array

    	// Put the element into two array
    	for (int idx = 0, b = 0, c = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= limit)
        	{
            		B[b] = A[idx];
            		System.out.println("B = " + B[b]);
            		b++;
        	} else {
            		C[c] = A[idx];
            		System.out.println("C = " + C[c]);
            		c++;
        	}
    	}
}
