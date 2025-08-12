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
        long double x = atof (args[2]);
        long double y = atof (args[3]);
        printf ("%.2Lf added to %.2Lf equals %.2Lf\n", x, y, x + y);
    }
    if (strcmp (args[1], "x") == 0) {
        long double x = atof (args[2]);
        long double y = atof (args[3]);
        printf ("%.2Lf multiplied by %.2Lf gives %.2Lf\n", x, y, x * y);
    }
    if (strcmp (args[1], "%") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("the modulo of %d by %d is %d\n", x, y, x % y);
    }
    if (strcmp (args[1], "/") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%d divided by %d is %d\n", x, y, x / y);
    }
    return 0;
}
