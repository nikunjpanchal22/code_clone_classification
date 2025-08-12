int main (void) {
    int N;
    printf ("Give the array size: ");
    scanf ("%d", & N);
    int array [N];
    ReadArrayData (N, array);
    int sumOfArrayElements = CalculateArraySum (N, array);
    printf ("The sum of array elements is %d.\n", sumOfArrayElements);
    return 0;
}


 int main (void) {
    int N;
    printf("Give the array size: ");
    scanf("%d", &N);
    int array[N];
    memset(array, 0, sizeof(array));
    ReadArrayData(N, array);
    int sumOfArrayElements = CalculateArraySum (N, array);
    printf("The sum of array elements is %d.\n", sumOfArrayElements);
    return 0;
}
