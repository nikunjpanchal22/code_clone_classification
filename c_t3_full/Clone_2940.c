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





int main (int argc, char** argv) {
    int _char;
    size_t n = 0, _charNum = NCHAR;
    char *chararray = (char*) malloc(sizeof(char)*_charNum);
    FILE *fp = (argc > 1) ? fopen(argv[1], "r") : stdin;
    if (chararray == NULL) {
        fprintf(stderr,"Memory could not be allocated\n");
        return -1;
    }
    if (!fp) {
        perror(argv[1]);
        return 1;
    }
    while ((_char = fgetc(fp)) != EOF) {
        chararray[n++] = _char;
        if (n == _charNum) {
            chararray = realloc(chararray, (_charNum*sizeof(char)) + NCHAR);
            if(!chararray) {
                perror("Could not resize memory\n");
                break;
            }
            _charNum += NCHAR;
        }
    }
    chararray[n] = '\0';
    if (fp != stdin)
        fclose(fp);
    for (size_t i = 0; i < n; i++)
        putchar(chararray[i]);
    free(chararray);
    return 0;
}


