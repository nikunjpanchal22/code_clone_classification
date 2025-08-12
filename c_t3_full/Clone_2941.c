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





#define INITSZ 100
#define GROWTH 2
int main(int argc, char **argv) {
    char *buf = malloc(INITSZ);
    FILE *fp = (argc > 1) ? fopen(argv[1], "r") : stdin;
    size_t n = 0, reclen = INITSZ;

    if(!fp) {
        perror(argv[1]);
        return 1;
    }

    int c;
    while ((c = fgetc(fp)) != EOF) {
        buf[n++] = c;
        if (n == reclen) {
            char *tmp;
            if(!(tmp = realloc(buf, reclen *= GROWTH))) {
                fprintf(stderr,"realloc failed\n");
                break;
            }
            buf = tmp;
        }
    }

    if(fp != stdin)
        fclose(fp);

    fwrite(buf, sizeof *buf, n, stdout);
    free(buf);
    return 0;
}


