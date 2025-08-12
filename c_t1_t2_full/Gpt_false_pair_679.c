int main (void) {
    size_t i, j, k;
    int s3;
    int arr1 [] = {1, 2, 3, 4, 7, 8, 9};
    int arr2 [] = {3, 4, 5};
    size_t s1 = sizeof (arr1) / sizeof (int);
    size_t s2 = sizeof (arr2) / sizeof (int);
    int arr3 [s1];
    int e;
    int found = 0;
    k = 0;
    for (i = 0; i < s1; i++) {
        e = arr1[i];
        found = 0;
        for (j = 0; j < s2; j++) {
            if (e == arr2[j]) {
                found = 1;
                break;
            }
        }
        if (found == 0) {
            arr3[k] = e;
            k++;
        }
    }
    printf ("arr1 has %d elements:\n", s1);
    for (i = 0; i < s1; i++) {
        printf ("%d ", arr1 [i]);
    }
    printf ("\narr2 has %d elements:\n", s2);
    for (i = 0; i < s2; i++) {
        printf ("%d ", arr2 [i]);
    }
    printf ("\narr3 has %d elements:\n", k);
    for (i = 0; i < k; i++) {
        printf ("%d ", arr3 [i]);
    }
    return 0;
}


 
int main (void) {
    size_t i, j, k;
    int s3;
    int arr1 [] = {1, 2, 3, 4, 7, 8, 9};
    int arr2 [] = {3, 4, 5};
    size_t s1 = sizeof (arr1) / sizeof (int);
    size_t s2 = sizeof (arr2) / sizeof (int);
    int arr3 [s1];
    bool found = false;
    k = 0;
    for (i = 0; i < s1; i++) {
        int element = arr1[i];
        for (j = 0; j < s2; j++) {
            if (element == arr2[j]) {
                found = true;
                break;
            }
        }
        if (!found) {
            arr3[k] = element;
            k++;
        }
    }
    printf ("arr1 has %d elements:\n", s1);
    for (i = 0; i < s1; i++) {
        printf ("%d ", arr1 [i]);
    }
    printf ("\narr2 has %d elements:\n", s2);
    for (i = 0; i < s2; i++) {
        printf ("%d ", arr2 [i]);
    }
    printf ("\narr3 has %d elements:\n", k);
    for (i = 0; i < k; i++) {
        printf ("%d ", arr3 [i]);
    }
    return 0;
}
