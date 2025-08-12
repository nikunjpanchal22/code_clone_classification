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
    int number;
    printf ("Please indicate the size of the array: ");
    scanf ("%d", & number);
    int array [number];
    LoadDataInArray (number, array);
    int sumOfArrayContents = ComputeArraySum (number, array);
    printf ("The total sum of the array elements is %d.\n", sumOfArrayContents);
    return 0;
}
