int main (int argc, char **argv) {
    int g [MAXP] = {0}, a [MAXP] = {0}, n = 0;
    char *names [MAXP] = {NULL};
    FILE *fp = argc > 1 ? fopen (argv[1], "r") : stdin;
    if (!fp) {
        fprintf (stderr, "error: file open failed '%s'.\n", argv [1]);
        return 1;
    }
    n = readfp (fp, g, a, names, MAXP);
    if (fp != stdin)
        fclose (fp);
    if (n)
        for (int i = 0; i < n; i++) {
            printf ("%-30s %8d %8d\n", names [i], g [i], a [i]);
            free (names [i]);
        }
    return 0;
}



 int main (int argc, char **argv) {
    int g [MAXP] = {0}, a [MAXP] = {0}, n = 0;
    char *names [MAXP] = {NULL};
    FILE *fp;
    
    if (argc > 1) {
        fp = fopen (argv[1], "r");
        if (!fp) {
            fprintf (stderr, "error: file open failed '%s'.\n", argv [1]);
            return 1;
        }
    }
    else
        fp = stdin;
        
    n = readfp (fp, g, a, names, MAXP);
    
    if (fp != stdin)
        fclose (fp);
        
    if (n) {
        for (int i = 0; i < n; i++) {
            printf("%-30s %8d %8d\n", names[i], g[i], a[i]);
            free(names[i]);
        }
    }
    return 0;
}


