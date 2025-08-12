int main (int ac, char *args []) {
    if (ac < 4) {
        printf ("Invalid Argument");
        return 0;
    }
    if (strcmp (args[1], "+") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        printf ("%d + %d = %d\n", x, y, x + y);
    }
    if (strcmp (args[1], "x") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        printf ("%d * %d = %d\n", x, y, x * y);
    }
    if (strcmp (args[1], "%") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%d %% %d = %d\n", x, y, x % y);
    }
    if (strcmp (args[1], "/") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%d / %d = %d\n", x, y, x / y);
    }
    return 0;
}


 int main (int ac, char *args []) {
    if (ac < 4) {
        printf ("Invalid Argument");
        return 0;
    }
    if (strcmp (args[1], "+") == 0) {
        long int x = atol (args[2]);
        long int y = atol (args[3]);
        printf ("%li + %li = %li\n", x, y, x + y);
    }
    if (strcmp (args[1], "x") == 0) {
        long int x = atol (args[2]);
        long int y = atol (args[3]);
        printf ("%li * %li = %li\n", x, y, x * y);
    }
    if (strcmp (args[1], "%") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%d modulus %d = %d\n", x, y, x % y);
    }
    if (strcmp (args[1], "/") == 0) {
        double x = atof (args[2]);
        double y = atof (args[3]);
        if (y == 0)
            return 0;
        printf ("%.2f divided by %.2f = %.2f\n", x, y, x / y);
    }
    return 0;
}
