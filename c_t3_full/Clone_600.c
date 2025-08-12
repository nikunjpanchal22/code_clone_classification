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
    printf ("Enter the array size: ");
    scanf ("%d", &N);
    int array[N];
    ReadArrayData(N, array);
    int sum = 0;
    for (int i = 0; i < N; i++) {
        sum = array[i] + sum;
    }
    printf ("The sum of array elements is %d.\n", sum);
    return 0;
}


