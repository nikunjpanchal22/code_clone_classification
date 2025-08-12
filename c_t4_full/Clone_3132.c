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
    int* common = (int*) malloc(sizeof(int) * MIN(n, n));
    int i, j=0, k=0;
    *length = 0;

    qsort(a1, n, sizeof(int), cmpfunc);
    qsort(a2, n, sizeof(int), cmpfunc);

    while(i<n && j<n) {
        if(a1[i]<a2[j])
            i++;
        else if(a2[j]<a1[i])
            j++;
        else {
            common[k++] = a2[j++];
            i++;
        }
    }

    *length = k;
    return common;
}


