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
    char buff [MAXC] = {0};
    sp s [MAXS];
    size_t i, n = 0;
    FILE *in_fp = argc > 1 ? fopen (argv[1], "r") : stdin;
    FILE *temp_fp = fopen (argc > 2 ? argv[2] : "../dat/template.txt", "r");
    FILE *out_fp = argc > 3 ? fopen (argv[3], "w") : stdout;
    if (!in_fp || !temp_fp || !out_fp) {
        fprintf (stderr, "error: file open failed.\n");
        return 1;
    }
    while (fgets (buff, MAXC, in_fp)) {
        char *p;
        size_t idx = 0;
        for (p = strtok (buff, "|"); p; p = strtok (NULL, "|\n")) {
            fill_struct (& s [n], p, & idx);
        }
        if (++n == MAXS) {
            fprintf (stderr, "MAXS structs filled.\n");
            break;
        }
    }
    for (i = 0; i < n; i++)
        greet_user (&s[i], temp_fp);
    if (in_fp != stdin)
        fclose (in_fp);
    if (out_fp != stdout)
        fclose (out_fp);
    fclose (temp_fp);
    return 0;
}
