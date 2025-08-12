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


int main (int argc, char **argv) {
    char buffer [MAXC] = {0};
    sp s [MAXS];
    size_t i, n = 0;
    FILE *input_fp = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *template_fp = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *out_fp = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!input_fp || !template_fp || !out_fp) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buffer, MAXC, input_fp)) {
        char *p;
        size_t index = 0;
        for (p = strtok (buffer, "|"); p; p = strtok (NULL, "|\n")) {
            fill_sp (& s [n], p, & index);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (i = 0; i < n; i++)
        greet (&s[i], template_fp);
    if (input_fp != stdin)
        fclose (input_fp);
    if (out_fp != stdout)
        fclose (out_fp);
    fclose (template_fp);
    return 0;
}
