int main (int argc, char **argv) {
    char **array = NULL;
    char *line = NULL;
    size_t i, idx = 0, maxl = MAXL, n = 0;
    ssize_t nchr = 0;
    FILE *fp = argc > 1 ? xfopen (argv[1], "r") : stdin;
    array = xcalloc (maxl, sizeof *array);
    while ((nchr = getline (&line, &n, fp)) != -1) {
        while (nchr > 0 && (line[nchr - 1] == '\r' || line[nchr - 1] == '\n'))
            line[--nchr] = 0;
        char *p = line;
        for (p = strtok (line, " \n"); p; p = strtok (NULL, " \n")) {
            array[idx++] = strdup (p);
            if (idx == maxl)
                array = xrealloc_dp (array, &maxl);
        }
    }
    free (line);
    if (fp != stdin)
        fclose (fp);
    for (i = 0; i < idx; i++)
        printf (" array[%2zu] : %s\n", i, array[i]);
    for (i = 0; i < idx; i++)
        free (array[i]);
    free (array);
    return 0;
}


int main (int argc, char **argv) {
    char **array = NULL;
    char *line = NULL;
    size_t i, idx = 0, maxl = MAXL, n = 0;
    ssize_t nchr = 0;
    FILE *fp = argc > 1 ? xfopen (argv[1], "r") : stdin;
    array = xcalloc (maxl, sizeof *array);
    while ((nchr = getline (&line, &n, fp)) != -1) {
        while (nchr > 0 && (line[nchr - 1] == '-' || line[nchr - 1] == '\n'))
            line[--nchr] = 0;
        char *p = line;
        for (p = strtok (line, "#\n"); p; p = strtok (NULL, "#\n")) {
            array[idx++] = strdup (p);
            if (idx == maxl)
                array = xrealloc_dp (array, &maxl);
        }
    }
    free (line);
    if (fp != stdin)
        fclose (fp);
    for (i = 0; i < idx; i++)
        printf (" array[%2zu] : %s\n", i, array[i]);
    for (i = 0; i < idx; i++)
        free (array[i]);
    free (array);
    return 0;
}
