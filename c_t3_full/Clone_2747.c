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





#include <stdio.h>
#include <stdlib.h>
#include <string.h>

#define LMAX 1024

int main (int argc, char **argv) {
    if (argc < 2) {
        fputs ("error: insufficient input, usage: ", stderr), fputs(argv [0], stderr), fputs (" <filename>\n", stderr);
        return 1;
    }
    char **array = NULL;
    char *ln = calloc (1, sizeof *ln);
    size_t n = 0;
    ssize_t nchr = 0;
    size_t idx = 0;
    size_t it = 0;
    size_t lmax = LMAX;
    FILE *fp = fopen (argv[1], "r");
    if (fp == NULL) {
        fputs ("error: file open failed '", stderr), fputs(argv [1], stderr), fputs ("'.\n", stderr);
        return 1;
    }
    array = calloc (lmax, sizeof *array);
    if (array == NULL) {
        fputs ("error: memory allocation failed.\n", stderr);
        return 1;
    }
    while ((nchr = getline (&ln, &n, fp)) != -1) {
        while (nchr > 0 && (ln[nchr - 1] == '\n' || ln[nchr - 1] == '\r'))
            ln[--nchr] = 0;
        array[idx++] = strdup (ln);
        if (idx == lmax) {
            array = realloc (array, lmax *2 * sizeof *array);
            if (array == NULL)
                return -1;
            lmax *= 2;
        }
    }
    fclose (fp);
    free (ln);
    fputs ("\nLines in file:\n\n", stdout);
    for (it = 0; it < idx; it++)
        fprintf(stdout, "  array [%3zu]  %s\n", it, array[it]);
    fputs ("\n", stdout);
    for (it = 0; it < idx; it++)
        free (array[it]);
    free (array);
    return 0;
}


