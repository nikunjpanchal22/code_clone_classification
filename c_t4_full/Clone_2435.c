int main (int argc, char **argv) {
    if (argc < 2) {
        fprintf (stderr, "error: insufficient input, usage: %s <filename>\n", argv [0]);
        return 1;
    }
    char **array = NULL;
    char *ln = NULL;
    size_t n = 0;
    ssize_t nchr = 0;
    size_t idx = 0;
    size_t it = 0;
    size_t lmax = LMAX;
    FILE *fp = NULL;
    if (!(fp = fopen (argv[1], "r"))) {
        fprintf (stderr, "error: file open failed '%s'.", argv [1]);
        return 1;
    }
    if (!(array = calloc (LMAX, sizeof *array))) {
        fprintf (stderr, "error: memory allocation failed.");
        return 1;
    }
    while ((nchr = getline (&ln, &n, fp)) != -1) {
        while (nchr > 0 && (ln[nchr - 1] == '\n' || ln[nchr - 1] == '\r'))
            ln[--nchr] = 0;
        array[idx++] = strdup (ln);
        if (idx == lmax) {
            char **tmp = realloc (array, lmax *2 * sizeof *array);
            if (!tmp)
                return -1;
            array = tmp;
            lmax *= 2;
        }
    }
    if (fp)
        fclose (fp);
    if (ln)
        free (ln);
    printf ("\nLines in file:\n\n");
    for (it = 0; it < idx; it++)
        printf ("  array [%3zu]  %s\n", it, array[it]);
    printf ("\n");
    for (it = 0; it < idx; it++)
        free (array[it]);
    free (array);
    return 0;
}





int main (int argc, char **argv) {
    if (argc < 2) {
        fprintf (stderr, "error: insufficient input, usage: %s <filename>\n", argv [0]);
        return 1;
    }

    FILE *fp;
    if ((fp = fopen(argv[1], "r")) == NULL) {
        fprintf (stderr, "error: file open failed '%s'.\n", argv [1]);
        return 1;
    }

    size_t n = 0;
    ssize_t nchr;
    int idx = 0;
    char **array = malloc(LMAX * sizeof(char*));
    char *ln = NULL;
    while ((nchr = getline(&ln, &n, fp)) != -1) {
        array[idx] = malloc(LMAX * sizeof(char));
        strcpy(array[idx++], ln);
        if (idx == LMAX) {
            array = realloc(array, LMAX * 2 * sizeof(char *));
            for(size_t i = LMAX; i < LMAX * 2; i++)
                array[i] = malloc(LMAX * sizeof(char));
        }
    }
    
    fclose(fp);
    free(ln);

    for (int i = 0; i < idx; i++) 
        printf("%s", array[i]);

    for (int i = 0; i < idx; i++)
        free(array[i]);
    free(array);

    return 0;
}


