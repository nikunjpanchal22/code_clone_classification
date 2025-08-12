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


 int main(int argc, char **argv) {
   int (*arr)[MAX] = {NULL};
   int **arrd = NULL;
   size_t i, n;
   n = argc > 1 ? atoi(argv[1]) : 5;
   arr = (int (*)[MAX]) populateAndDistribute(n);
   arrd = populateAndDistributeDp(n);
   if (!arr || !arrd) {
      fprintf(stderr, "error: alloc_fill failed.\n");
      return 1;
   }
   printf("\n elements of '%zu' arrays:\n\n", n);
   createArray(arr, n);
   printf("\n elements of '%zu' arrays:\n\n", n);
   createArrayDp(arrd, n, MAX);
   free(arr);
   for (i = 0; i < n; i++)
      free(arrd[i]);
   free(arrd);
   return 0;
}
