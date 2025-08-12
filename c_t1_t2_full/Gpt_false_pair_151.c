int main () {
    int i, j, dup = 0;
    int arr [10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (i = 0; i < 10; i++) {
        for (j = i + 1; j < 10; j++) {
            if (arr[i] == arr[j]) {
                printf ("arr[%d] = %d = arr[%d] = %d\n", i, arr [i], j, arr [j]);
                dup++;
            }
        }
    }
    printf ("\nnumber of duplicates is %d\n", dup);
    return 0;
}


 int main () {
    int m, p, repeat = 0;
    int arr [10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (m = 0; m < 10; m++) {
        for (p = m + 1; p < 10; p++) {
            if (arr[m] == arr[p]) {
                printf ("arr[%d] = %d = arr[%d] = %d\n", m, arr [m], p, arr [p]);
                repeat++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", repeat);
    return 0;
}
