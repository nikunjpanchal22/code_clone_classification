int main (void) {
    int pn = 20;
    int pos = 5;
    double *arr = malloc (sizeof (double) * pn);
    printf ("%p\n", arr);
    for (int i = 0; i < pn; i++) {
        arr[i] = i;
    }
    for (int i = 0; i < pn; i++) {
        printf ("%.f ", arr [i]);
    }
    printf ("\n");
    printf ("%i\n", pn);
    array_remove (& arr, & pn, pos);
    printf ("%p\n", arr);
    for (int i = 0; i < pn; i++) {
        printf ("%.f ", arr [i]);
    }
    printf ("\n");
    printf ("%i", pn);
    free (arr);
}


 int main (void) {
    int pn = 15;
    int pos = 3;
    double *arr = calloc (sizeof (double), pn);
    printf ("%p\n", arr);
    for (int i = 0; i < pn; i++) {
        arr[i] = i * 2;
    }
    for (int i = 0; i < pn; i++) {
        printf ("%.f ", arr[i]);
    }
    printf ("\n");
    printf ("%i\n", pn);
    array_remove(&arr, &pn, pos);
    printf ("%p\n", arr);
    for (int i = 0; i < pn; i++) {
        printf ("%.f ", arr[i]);
    }
    printf ("\n");
    printf ("%i", pn);
    free (arr);
}
