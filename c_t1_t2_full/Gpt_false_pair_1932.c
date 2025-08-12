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
    int *a1, *a2, i, n, *common, length;
    printf ("Enter the number of elements in the array: ");
    scanf ("%d", &n);
    a1 = (int *)malloc (sizeof (int) * n);
    a2 = (int *)malloc (sizeof (int) * n);
    printf ("Enter elements of first array\n");
    for (i = 0; i < n; i++) {
        scanf ("%d", &a1[i]);
    }
    printf ("Enter elements of second array\n");
    for (i = 0; i < n; i++) {
        scanf ("%d", &a2[i]);
    }
    common = commonelefind (a1, a2, n, &length);
    if (length == 0) {
        printf ("No common elements were found\n");
    }
    else {
        printf ("The common elements are:\n");
        for (i = 0; i < length; i++) {
            printf ("%d\n", common[i]);
        }
    }
    free (common);
    return 0;
}
