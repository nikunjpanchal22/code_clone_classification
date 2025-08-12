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
    int arraySize;
    printf ("Please specify the array size: ");
    scanf ("%d", & arraySize);
    int contents [arraySize];
    EnterDataIntoArray (arraySize, contents);
    int totalOfArrayElements = TotalSumOfArray (arraySize, contents);
    printf ("The sum of values in the array is %d.\n", totalOfArrayElements);
    return 0;
}
