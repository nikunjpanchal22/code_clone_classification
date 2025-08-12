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
        long long int x = atoll (args[2]);
        long long int y = atoll (args[3]);
        printf ("%lli + %lli = %lli\n", x, y, x + y);
    }
    if (strcmp (args[1], "x") == 0) {
        long long int x = atoll (args[2]);
        long long int y = atoll (args[3]);
        printf ("%lli * %lli = %lli\n", x, y, x * y);
    }
    if (strcmp (args[1], "%") == 0) {
        int x = atoi (args[2]);
        int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%d modulo %d = %d\n", x, y, x % y);
    }
    if (strcmp (args[1], "/") == 0) {
        unsigned int x = atoi (args[2]);
        unsigned int y = atoi (args[3]);
        if (y == 0)
            return 0;
        printf ("%u / %u = %u\n", x, y, x / y);
    }
    return 0;
}
