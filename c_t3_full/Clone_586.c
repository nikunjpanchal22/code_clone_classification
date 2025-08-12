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
    while (N > 0) {
      scanf("%d", &array[N-1]);
      N--;
    }
    int sumOfArrayElements = 0;
    while (N < sizeof(array)) {
      sumOfArrayElements += array[N];
      N++;
    }
    printf("The sum of array elements is %d.\n", sumOfArrayElements);
    return 0;
}


