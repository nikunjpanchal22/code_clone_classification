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





int main(int argc, char *argv[])
{
    int c;
    char *buffer = malloc(NCHAR);
    size_t n = 0, len = NCHAR;
    FILE *input = argc > 1 ? fopen(argv[1], "r"): stdin;

    if(!input)
    {
        perror(argv[1]);
        return 1;
    }

    while((c = getc(input)) != EOF)
    {
         buffer[n++] = c;

         if(n == len)
         {
             len *= 2;
             buffer = realloc(buffer, len);

             if(!buffer)
             {
                perror("failed to reallocate memory");
                return 2;
              }
         }
    }

    buffer[n] = '\0';

    if (input != stdin)
        fclose(input);

    printf("%s", buffer);
    free(buffer);
    return 0;
}


