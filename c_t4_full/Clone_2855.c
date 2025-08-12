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





#define INITBUF 1024

int main (int argc, char **argv) {

    char *buf = malloc(INITBUF);
    FILE *fp = (argc > 1) ? fopen(argv[1], "r") : stdin;
    size_t cap = INITBUF, n = 0;
    int c;

    if (!fp) {
        perror(argv[1]);
        return 1;
    }

    while((c = getc(fp)) != EOF) {
        buf[n++] = c;
        if(n == cap) {
            cap *= 2;
            buf = realloc(buf, cap);
        }
    }

    if(fp != stdin)
        fclose(fp);

    puts(buf);
    free(buf);
    return 0;
}


