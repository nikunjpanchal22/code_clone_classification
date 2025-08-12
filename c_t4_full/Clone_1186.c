int main (int argc, char *argv []) {
    int a [] = {31, 44, 44, 67, 67, 99, 99, 100, 101};
    int k = remove_dups (a, 9);
    assert (k == 3);
    for (int i = 0; i < k; i++)
        printf ("%d ", a[i]);
    printf ("\n\n");
    int b [] = {-5, -3, -2, -2, -2, -2, 1, 3, 5, 5, 18, 18};
    k = remove_dups (b, 12);
    assert (k == 4);
    for (int i = 0; i < k; i++)
        printf ("%d ", b[i]);
    printf ("\n\n");
    int c [] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
    k = remove_dups (c, 9);
    assert (k == 9);
    for (int i = 0; i < k; i++)
        printf ("%d ", c[i]);
    return 0;
}






int remove_dups(int a[], int num_elements) {
    int i, j;
    for (i = 0; i < num_elements; i++) {
        for (j = i+1; j < num_elements; ) {
            if (a[j] == a[i]) {
                int k;
                for (k = j; k < num_elements; k++) {
                    a[k] = a[k+1];
                }
                num_elements--;
            } else {
                j++;
            }
        }
    }
    return num_elements;
}


