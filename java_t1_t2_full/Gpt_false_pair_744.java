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
    int size_b = 0; // Size of B
    int size_c = 0; // Size of C

    // Calculate the Size of B and C
    for (int i = 0; i < A.length; i++)
    {
        if (A[i] <= t)
        {
            size_b++;
        } else {
            size_c++;
        }
    }

    int[] B = new int[size_b]; // Create B Array
    int[] C = new int[size_c]; // Create C Array

    // Put the element in to the two array
    for (int i = 0, x = 0, y = 0; i < A.length; i++) 
    {
        if (A[i] <= t)
        {
            B[x] = A[i];
            System.out.println("B = " + B[x]);
            x++;
        } else {
            C[y] = A[i];
            System.out.println("C = " + C[y]);
            y++;
        }
    }
}
