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
    int idx, idxx, dbl = 0;
    int arrayEle [10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (idx = 0; idx < 10; idx++) {
        for (idxx = idx+ 1; idxx < 10; idxx++) {
            if (arrayEle[idx] == arrayEle[idxx]) {
                printf ("arrayEle[%d] = %d = arrayEle[%d] = %d\n", idx, arrayEle [idx], idxx, arrayEle [idxx]);
                dbl++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", dbl);
    return 0;
}
