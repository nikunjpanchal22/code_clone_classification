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
    int sumOfArrayElements;
    printf("Give the array size: ");
    scanf("%d", &N);
    int *arrayPtr = malloc(N * sizeof(int));
    for (int i=0; i<N; i++)
      scanf("%d", &arrayPtr[i]);
    sumOfArrayElements = CalculateArraySum (N, arrayPtr);
    printf("The sum of array elements is %d.\n", sumOfArrayElements);
    free(arrayPtr);
    return 0;
}


