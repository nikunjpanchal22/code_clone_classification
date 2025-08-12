static void xn () {
    double r = 3.9;
    double [] xr_arr = new double [100];
    for (double x = 0; x <= 1; x += 0.01) {
        double xr = r * x * (1 - x);
        xr_arr [x] = xr;
        for (int y = 0; y < 23; y ++) {
            Console.WriteLine (xr_arr [y]);
        }
    }
}


 static void xn()
{
    double r = 3.9;
    double x = 0.0d;
    int xr_arr_length = 101;
    double[] xr_arr = new double[xr_arr_length];
    for (int i = 0; i < xr_arr_length; i++)
    {
        xr_arr[i] = r * x * (1 - x);
        x = x + 0.01;
    }
    for (int y = 0; y < 23; y++)
    {
        Console.WriteLine(xr_arr[y]);
    }
}


