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
    size_t iterate, n = 0;
    FILE *in = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *tem = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *out = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!in || !tem || !out) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buf, MAXC, in)) {
        char *pt;
        size_t i = 0;
        for (pt = strtok (buf, "|"); pt; pt = strtok (NULL, "|\n")) {
            fill_s_sp (& s [n], pt, & i);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (iterate = 0; iterate < n; iterate++)
        welcome_u (&s[iterate], tem);
    if (in != stdin)
        fclose (in);
    if (out != stdout)
        fclose (out);
    fclose (tem);
    return 0;
} 
