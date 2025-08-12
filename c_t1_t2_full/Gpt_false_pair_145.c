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
    int x, y, ident = 0;
    int a [10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (x = 0; x < 10; x++) {
        for (y = x + 1; y < 10; y++) {
            if (a[x] == a[y]) {
                printf ("a[%d] = %d = a[%d] = %d\n", x, a [x], y, a [y]);
                ident++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", ident);
    return 0;
}
