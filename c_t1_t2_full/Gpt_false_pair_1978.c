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
        double x = atof (args[2]);
        double y = atof (args[3]);
        printf ("%.2f plus %.2f equals %.2f\n", x, y, x + y);
    }
    if (strcmp (args[1], "x") == 0) {
        double x = atof (args[2]);
        double y = atof (args[3]);
        printf ("%.2f multiplied by %.2f gives %.2f\n", x, y, x * y);
    }
    if (strcmp (args[1], "%") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("the modulo of %d and %d is %d\n", x, y, x % y);
    }
    if (strcmp (args[1], "/") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%d divided by %d gives %d\n", x, y, x / y);
    }
    return 0;
}
