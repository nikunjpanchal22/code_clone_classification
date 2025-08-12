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
    // Create a new double array
    double[][] b = new double[x][x];

    // Use Math.min to set x correctly
    int rows = Math.min(x, a.length);
    int cols = x;

    // Create a for loop to go through each element in array a
    for (int i = 0; i < rows; i++) 
    {
        for (int j = 0; j < cols; j++) 
        {
            // Assign values from a to b
            b[i][j] = a[i][j];
        }
    }

    // Return filled double array
    return b;
}


