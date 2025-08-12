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
    int index, innerIndex, duplicate = 0;
    int array [10] = {4, 7, 2, 4, 3, 1, 7, 9, 6, 5};
    for (index = 0; index < 10; index++) {
        for (innerIndex = index + 1; innerIndex < 10; innerIndex++) {
            if (array[index] == array[innerIndex]) {
                printf ("array[%d] = %d = array[%d] = %d\n", index, array [index], innerIndex, array [innerIndex]);
                duplicate++;
            }
        }
    }
    printf ("\nNumber of duplicates is %d\n", duplicate);
    return 0;
}
