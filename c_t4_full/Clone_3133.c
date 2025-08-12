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





int* commonelefind(int* a1, int* a2, int n, int* length) {
    int* common = (int*) malloc(sizeof(int) * n);
    int i, j, k = 0;

    for (i = 0; i < n; i++)
        for (j = 0; j < n; j++)
            if(a1[i] == a2[j]) {
                common[k] = a1[i];
                k++;
            }

    *length = k;
    return common;
}


