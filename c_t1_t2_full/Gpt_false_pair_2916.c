int main (int argc, char *argv []) {
    char msg [2000];
    int msgl;
    int x, i, n;
    double d [10];
    if (argc > 12 || argc < 3) {
        puts ("Usage: prgname ni nd1 {nd2,nd3 ..., nd10}\n");
        return 1;
    }
    n = argc - 2;
    x = atoi (argv[1]);
    for (i = 0; i < n; i++)
        d[i] = strtod (argv[i + 2], NULL);
    *msg = 0;
    msgl = sprintf (msg, "%d", x);
    for (i = 0; i < n; i++)
        msgl += sprintf (msg +msgl, " %lf", d[i]);
    puts (msg);
    return 0;
}


int fun( int argc, char *argv []) {
    char str [2000];
    int strl;
    int x_val, i, n;
    double arr [10];
    if (argc > 12 || argc < 3) {
        printf ("Usage: prgname ni nd1 {nd2,nd3 ..., nd10}\n");
        return 1;
    }
    n = argc - 2;
    x_val = atoi (argv[1]);
    for (i = 0; i < n; i++)
        arr[i] = strtod (argv[i + 2], NULL);
    *str = 0;
    strl = snprintf (str, sizeof str, "%d", x_val);
    for (i = 0; i < n; i++)
        strl += snprintf (str +strl, sizeof str - strl, " %lf", arr[i]);
    printf (str);
    return 0;
}
