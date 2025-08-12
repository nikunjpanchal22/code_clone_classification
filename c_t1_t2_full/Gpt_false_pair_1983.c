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
        unsigned int x = atoi (args[2]);
        unsigned int y = atoi (args[3]);
        printf ("%u plus %u equals %u\n", x, y, x + y);
    }
    if (strcmp (args[1], "x") == 0) {
        unsigned int x = atoi (args[2]);
        unsigned int y = atoi (args[3]);
        printf ("%u multiplied by %u gives %u\n", x, y, x * y);
    }
    if (strcmp (args[1], "%") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("the remainder of %d divided by %d is %d\n", x, y, x % y);
    }
    if (strcmp (args[1], "/") == 0) {
        double x = atof (args[2]);
        double y = atof (args[3]);
        if (y == 0)
            return 0;
        printf ("%.2f divided by %.2f equals %.2f\n", x, y, x / y);
    }
    return 0;
}
