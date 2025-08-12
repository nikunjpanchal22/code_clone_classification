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
    int a, b, copy = 0;
    int num [10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (a = 0; a < 10; a++) {
        for (b = a + 1; b < 10; b++) {
            if (num[a] == num[b]) {
                printf ("num[%d] = %d = num[%d] = %d\n", a, num [a], b, num [b]);
                copy++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", copy);
    return 0;
}
