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
    int size;
    printf ("Please give the size of the array: ");
    scanf ("%d", & size);
    int data [size];
    ReadArrayContents (size, data);
    int totalElements = SumOfArrayData (size, data);
    printf ("The total of all array elements is %d.\n", totalElements);
    return 0;
}
