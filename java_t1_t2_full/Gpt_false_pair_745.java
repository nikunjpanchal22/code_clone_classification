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
    int t = 4;
    int b_count = 0; // Count of B array 
    int c_count = 0; // Count of C array 

    // Calculate the size of B and C array
    for (int i = 0; i < A.length; i++)
    {
        if (A[i] <= t)
        {
            b_count++;
        } else {
            c_count++;
        }
    }

    int[] B = new int[b_count]; // create B array
    int[] C = new int[c_count]; // create C array

    // Put element into the two array
    for (int i = 0, b_index = 0, c_index = 0; i < A.length; i++)
    {
        if (A[i] <= t)
        {
            B[b_index] = A[i];
            System.out.println("B = " + B[b_index]);
            b_index++;
        } else {
            C[c_index] = A[i];
            System.out.println("C = " + C[c_index]);
            c_index++;
        }
    }
}
