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





int main (int argc, char **argv) {
    int charData;
    size_t currentIndex = 0, characterCount = NCHAR;
    char *charArray = (char *)malloc(sizeof(char) * characterCount);
    FILE *filePointer = (argc > 1) ? fopen(argv[1], "r") : stdin;
    if (charArray == NULL) {
        fprintf(stderr, "Memory allocation failure.\n");
        return -1;
    }
    if(!filePointer) {
        perror(argv[1]);
        return 1;
    }
    while ((charData = fgetc(filePointer)) != EOF) {
        charArray[currentIndex++] = charData;
        if (currentIndex == characterCount) {
            charArray = realloc(charArray, (characterCount * sizeof(char)) +NCHAR);
            if(!charArray) {
                perror("Could not resize memory.\n");
                break;
            }
            characterCount += NCHAR;
        }
    }
    charArray[currentIndex] = 0;
    if (filePointer != stdin)
        fclose(filePointer);
    for (size_t i = 0; i < currentIndex; i++)
        putchar(charArray[i]);
    free(charArray);
    return 0;
}


