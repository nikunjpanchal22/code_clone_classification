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
    int arraySize = sizeof(array)/sizeof(array[0]);
    for (int i=0; i < arraySize; i++)
      scanf("%d", &array[i]);
    int sumOfArrayElements = 0;
    for (int j=0; j < arraySize; j++) {
      sumOfArrayElements += array[j];
      }
    printf("The sum of array elements is %d.\n", sumOfArrayElements);
    return 0;
}


