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
    sp s [MAXS];
    size_t counter, n = 0;
    FILE *inStream = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *templateStream = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *outStream = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!inStream || !templateStream || !outStream) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, inStream)) {
        char *ptr;
        size_t index = 0;
        for (ptr = strtok (buf, "|"); ptr; ptr = strtok (NULL, "|\n")) {
            fill_struct_sp (& s [n], ptr, & index);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (counter = 0; counter < n; counter++)
        Welc_ (&s[counter], templateStream);
    if (inStream != stdin)
        fclose (inStream);
    if (outStream != stdout)
        fclose (outStream);
    fclose (templateStream);
    return 0;
} 
