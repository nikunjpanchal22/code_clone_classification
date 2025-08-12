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
    for (int i=0; i < N; i++)
      scanf("%d", &array[i]);
    int sumOfArrayElements = 0;
    int i = 0;
    while (i < N) {
      sumOfArrayElements += array[i];
      i++;
    };
    printf("The sum of array elements is %d.\n", sumOfArrayElements);
    return 0;
}


