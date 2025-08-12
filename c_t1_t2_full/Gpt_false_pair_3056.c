int main () {
    int *a1, *a2, i, n, *common, length;
    printf ("enter no of elements in arrays: ");
    scanf ("%d", & n);
    a1 = (int *) malloc (sizeof (int) * n);
    a2 = (int *) malloc (sizeof (int) * n);
    printf ("enter elements 1st array\n");
    for (i = 0; i < n; i++) {
        scanf ("%d", & a1 [i]);
    }
    printf ("enter elements 2nd array\n");
    for (i = 0; i < n; i++) {
        scanf ("%d", & a2 [i]);
    }
    common = commonelefind (a1, a2, n, &length);
    if (length == 0) {
        printf ("there is no common element");
    }
    else {
        printf ("common elements are:\n");
        for (i = 0; i < length; i++) {
            printf ("%d\n", common [i]);
        }
    }
    free (common);
    return 0;
}


int main () {
    int *x1, *x2, i, size, *shared, count;
    printf ("enter no of elements in arrays: ");
    scanf ("%d", & size);
    x1 = (int *) malloc (sizeof (int) * size);
    x2 = (int *) malloc (sizeof (int) * size);
    printf ("enter elements 1st array\n");
    for (i = 0; i < size; i++) {
        scanf ("%d", & x1 [i]);
    }
    printf ("enter elements 2nd array\n");
    for (i = 0; i < size; i++) {
        scanf ("%d", & x2 [i]);
    }
    shared = commonelefind (x1, x2, size, &count);
    if (count == 0) {
        printf ("there is no common element");
    }
    else {
        printf ("common elements are:\n");
        for (i = 0; i < count; i++) {
            printf ("%d\n", shared [i]);
        }
    }
    free (shared);
    return 0;
}
