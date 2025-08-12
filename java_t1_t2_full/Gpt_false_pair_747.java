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
    	int line = 4;
    	int size_low = 0; // Size of Low array 
    	int size_high = 0; // Size of High array 

    	// Calculate size of Low and High 
    	for (int idx = 0; idx < A.length; idx++)
    	{
        	if (A[idx] <= line)
        	{
            		size_low++;
        	} else {
            		size_high++;
        	}
    	}

    	int[] low = new int[size_low]; // Create Low array
    	int[] high = new int[size_high]; // Create High array

    	// Put the element into two array
    	for (int idx = 0, l_idx = 0, h_idx = 0; idx < A.length; idx++) 
    	{
        	if (A[idx] <= line)
        	{
            		low[l_idx] = A[idx];
            		System.out.println("Low = " + low[l_idx]);
            		l_idx++;
        	} else {
            		high[h_idx] = A[idx];
            		System.out.println("High = " + high[h_idx]);
            		h_idx++;
        	}
    	}
}
