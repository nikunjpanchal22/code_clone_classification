public static double [] [] amountOTP (double [] [] a, int x) {
    double [] [] b = new double [x] [x];
    x = Math.min (x, a.length);
    for (int i = 0;
    i < x; i ++) for (int j = 0;
    j < x; j ++) b [i] [j] = a [i] [j];
    return b;
}


 public static double[][] amountOTP (double[][] a, int x) 
{
    // Declare a new double array 
    double[][] b = new double[x][x];

    // Use Math.min to set x correctly
    int cols = Math.min(x, a.length);
    int rows = x;

    // Create a for loop to go through each element in array a
    for (int i = 0; i < cols; i++) 
    {
        for (int j = 0; j < rows; j++) 
        {
            // Assign values from a to b
            b[i][j] = a[i][j];
        }
    }

    // Return the filled double array
    return b;
}


