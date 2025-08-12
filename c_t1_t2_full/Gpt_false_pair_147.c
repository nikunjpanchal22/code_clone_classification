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
    int iter1, iter2, duplicateCount = 0;
    int arrayInt[10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (iter1 = 0; iter1 < 10; iter1++) {
        for (iter2 = iter1 + 1; iter2 < 10; iter2++) {
            if (arrayInt[iter1] == arrayInt[iter2]) {
                printf ("arrayInt[%d] = %d = arrayInt[%d] = %d\n", iter1, arrayInt [iter1], iter2, arrayInt [iter2]);
                duplicateCount++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", duplicateCount);
    return 0;
}
