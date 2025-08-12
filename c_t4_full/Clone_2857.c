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





#define INIT_SIZE 1000
#define GROWTH_FACTOR 2

typedef struct {
            char *data;
            size_t len;
            size_t cap;
        } Str;

        Str *fgetl(FILE *f) {
            Str *s = malloc(sizeof(Str));
            s->len = 0;
            s->cap = INIT_SIZE;
            s->data = malloc(s->cap);
            int c;
            while((c = fgetc(f)) != EOF) {
                if(s->len == s->cap) {
                    s->cap *= GROWTH_FACTOR;
                    s->data = realloc(s->data, s->cap);
                }
                s->data[s->len] = c;
                s->len++;
            }
            if(f != stdin)
                fclose(f);
            return s;
        }

        int main(int argc, char **argv) {
            FILE *f = (argc > 1) ? fopen(argv[1], "r") : stdin;
            if(!f) {
                perror(argv[1]);
                return 1;
            }
            Str *s = fgetl(f);
            fwrite(s->data, 1, s->len, stdout);
            free(s->data);
            free(s);
            return 0;
}


