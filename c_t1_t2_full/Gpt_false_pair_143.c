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
    int index1, index2, duplicateNum = 0;
    int arrayNum[10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (index1 = 0; index1 < 10; index1++) {
        for (index2 = index1 + 1; index2 < 10; index2++) {
            if (arrayNum[index1] == arrayNum[index2]) {
                printf ("arrayNum[%d] = %d = arrayNum[%d] = %d\n", index1, arrayNum [index1], index2, arrayNum [index2]);
                duplicateNum++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", duplicateNum);
    return 0;
}
