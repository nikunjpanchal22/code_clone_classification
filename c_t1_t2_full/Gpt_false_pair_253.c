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
    size_t iterator, n = 0;
    FILE *inputStream = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *templateStream1 = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *outputStream = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!inputStream || !templateStream1 || !outputStream) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, inputStream)) {
        char *pt;
        size_t id = 0;
        for (pt = strtok (buf, "|"); pt; pt = strtok (NULL, "|\n")) {
            fill_thesp (& s [n], pt, & id);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (iterator = 0; iterator < n; iterator++)
        greetit_2 (&s[iterator], templateStream1);
    if (inputStream != stdin)
        fclose (inputStream);
    if (outputStream != stdout)
        fclose (outputStream);
    fclose (templateStream1);
    return 0;
}
