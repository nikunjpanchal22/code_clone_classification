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


static void yn () {
    double r = 4.3;
    double [] xr_arr = new double [100];
    for (double x = 0; x <= 1; x += 0.015) {
        double xr = r * x * (1 - x);
        xr_arr [x] = xr;
        for (int y = 0; y < 20; y ++) {
            Console.WriteLine (xr_arr [y]);
        }
    }
}
