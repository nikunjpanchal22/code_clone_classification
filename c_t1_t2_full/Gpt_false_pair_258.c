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
    size_t it, n = 0;
    FILE *inputSource = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *templateSource = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *outputSource = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!inputSource || !templateSource || !outputSource) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, inputSource)) {
        char *p;
        size_t ind = 0;
        for (p = strtok (buf, "|"); p; p = strtok (NULL, "|\n")) {
            fill_indsp (& s [n], p, & ind);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (it = 0; it < n; it++)
        welcome_3 (&s[it], templateSource);
    if (inputSource != stdin)
        fclose (inputSource);
    if (outputSource != stdout)
        fclose (outputSource);
    fclose (templateSource);
    return 0;
}
