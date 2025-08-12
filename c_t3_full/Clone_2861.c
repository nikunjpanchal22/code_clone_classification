int main (int argc, char **argv) {
    int (*array) [MAX] = {NULL};
    int **arraydp = NULL;
    size_t i, n;
    n = argc > 1 ? atoi (argv[1]) : 5;
    array = (int (*)[MAX]) alloc_fill (n);
    arraydp = alloc_fill_dp (n);
    if (!array || !arraydp) {
        fprintf (stderr, "error: alloc_fill failed.\n");
        return 1;
    }
    printf ("\n elements of '%zu' arrays:\n\n", n);
    prn_array (array, n);
    printf ("\n elements of '%zu' arrays:\n\n", n);
    prn_array_dp (arraydp, n, MAX);
    free (array);
    for (i = 0; i < n; i++)
        free (arraydp[i]);
    free (arraydp);
    return 0;
}





int main (int argc, char **argv) {
    int (*arrays) [MAX] = {NULL};
    int **doubleArrays = NULL;
    size_t index, size;

    size = (argc > 1 ? strtol (argv[1], NULL, 10) : 5);
    arrays = (int (*)[MAX]) calloc_arrays (size);
    doubleArrays = calloc_double_arrays (size);

    if (!arrays || !doubleArrays) {
        fprintf (stderr, "Memory allocation failed!\n");
        return EXIT_FAILURE;
    }

    printf ("\nArray Elements:\n\n");
    display_arrays (arrays, size);

    printf ("\nDouble Array Elements:\n\n");
    display_double_arrays (doubleArrays, size, MAX);

    free (arrays);
    for (index = 0; index < size; index++)
        free (doubleArrays[index]);
    free (doubleArrays);

    return EXIT_SUCCESS;
}


