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
    size_t c, n = 0;
    FILE *inFileSource = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *tempFileSource = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *outFileSource = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!inFileSource || !tempFileSource || !outFileSource) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, inFileSource)) {
        char *p;
        size_t id = 0;
        for (p = strtok (buf, "|"); p; p = strtok (NULL, "|\n")) {
            fulfill_struct_sp (& s [n], p, & id);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (c = 0; c < n; c++)
        greeting (&s[c], tempFileSource);
    if (inFileSource != stdin)
        fclose (inFileSource);
    if (outFileSource != stdout)
        fclose (outFileSource);
    fclose (tempFileSource);
    return 0;
}
