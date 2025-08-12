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
    int count_b = 0; // Count for B
    int count_c = 0; // Count for C

    // Count the size of B and C
    for (int i = 0; i < A.length; i++)
    {
        if (A[i] <= t)
        {
            count_b++;
        } else {
            count_c++;
        }
    }

    int[] B = new int[count_b]; // Create B array
    int[] C = new int[count_c]; // Create C array

    // Put the the two array
    for (int i = 0, j = 0, k = 0; i < A.length; i++)
    {
        if (A[i] <= t)
        {
            B[j] = A[i];
            System.out.println("B = " + B[j]);
            j++;
        } else {
            C[k] = A[i];
            System.out.println("C = " + C[k]);
            k++;
        }
    }
}
