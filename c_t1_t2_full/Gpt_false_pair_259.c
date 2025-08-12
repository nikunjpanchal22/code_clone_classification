int main (int argc, char **argv) {
    char buf [MAXC] = {0};
    sp s [MAXS];
    size_t i, n = 0;
    FILE *ifp = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *tfp = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *ofp = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!ifp || !tfp || !ofp) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, ifp)) {
        char *p;
        size_t idx = 0;
        for (p = strtok (buf, "|"); p; p = strtok (NULL, "|\n")) {
            fillsp (& s [n], p, & idx);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (i = 0; i < n; i++)
        welcome (&s[i], tfp);
    if (ifp != stdin)
        fclose (ifp);
    if (ofp != stdout)
        fclose (ofp);
    fclose (tfp);
    return 0;
}


 int main (int argc, char** argv) {
    char buf [MAXC] = {0};
    struct sp s [MAXS];
    size_t i, n = 0;
    FILE *inFile = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *templateFile = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *outFile = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!inFile || !templateFile || !outFile) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, inFile)) {
        char *p;
        size_t index = 0;
        for (p = strtok (buf, "|"); p; p = strtok (NULL, "|\n")) {
            f_fi_sp (& s [n], p, & index);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (i = 0; i < n; i++)
        w_ele (&s[i], templateFile);
    if (inFile != stdin)
        fclose (inFile);
    if (outFile != stdout)
        fclose (outFile);
    fclose (templateFile);
    return 0;
} 
