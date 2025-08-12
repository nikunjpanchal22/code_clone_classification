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


int mainFunc (int count, char *arg []) {
    char mes [2000];
    int mesl;
    int x, it, n_val;
    double vals [10];
    if (count > 12 || count < 3) {
        puts ("Usage: prgname ni nd1 {nd2,nd3 ..., nd10}\n");
        return 1;
    }
    n_val = count - 2;
    x = atoi (arg[1]);
    for (it = 0; it < n_val; it++)
        vals[it] = strtod (arg[it + 2], NULL);
    *mes = 0;
    mesl = sprintf (mes, "%d", x);
    for (it = 0; it < n_val; it++)
        mesl += snprintf (mes +mesl, sizeof mes - mesl, " %lf", vals[it]);
    puts (mes);
    return 0;
}
