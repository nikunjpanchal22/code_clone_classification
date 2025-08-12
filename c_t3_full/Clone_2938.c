int main (int argc, char **argv) {
    int c;
    size_t n = 0, nchar = NCHAR;
    char *arr = malloc (sizeof *arr * nchar);
    FILE *fp = argc > 1 ? fopen (argv[1], "r") : stdin;
    if (!fp) {
        fprintf (stderr, "error: file open failed '%s'.\n", argv [1]);
        return 1;
    }
    if (!arr) {
        fprintf (stderr, "error: virtual memory exhausted.\n");
        return 1;
    }
    while ((c = fgetc (fp)) != EOF) {
        arr[n++] = c;
        if (n == nchar) {
            void *tmp = realloc (arr, nchar +NCHAR);
            if (!tmp) {
                fprintf (stderr, "realloc() error: memory exhausted.\n");
                break;
            }
            arr = tmp;
            nchar += NCHAR;
        }
    }
    arr[n] = 0;
    if (fp != stdin)
        fclose (fp);
    for (size_t i = 0; i < n; i++)
        putchar (arr[i]);
    free (arr);
    return 0;
}





#define SZ 4096
int main (int argc, char **argv) {
    char *arr = malloc(sizeof *arr * SZ);
    FILE *fp = (argc > 1) ? fopen(argv[1], "r") : stdin;
    size_t n = 0;

    if (!fp) {
        fprintf(stderr, "error: file open failed '%s'.\n", argv[1]);
        return 1;
    }

    if (!arr) {
        fprintf(stderr, "error: virtual memory exhausted.\n");
        return 1;
    }

    for (;;) {
        int c = fgetc(fp);
        if (c == EOF)
            break;
        arr[n++] = c;
        if (!(n % SZ)) {
            char *tmp = realloc(arr, n + SZ);
            if (!tmp) {
                free(arr);
                fprintf(stderr, "error: unable to realloc. n = %zu.\n", n);
                return 1;
            }
            arr = tmp;
        }
    }

    if (fp != stdin)
        fclose(fp);

    fwrite(arr, sizeof *arr, n, stdout);
    free(arr);

    return 0;
}


