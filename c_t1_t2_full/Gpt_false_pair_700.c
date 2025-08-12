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
    printf ("Please input the desired array size: ");
    scanf ("%d", & N);
    int array [N];
    InputArrayValues (N, array);
    int totalArrayValues = SumOfArrayElements (N, array);
    printf ("The sum of all values in the array is %d.\n", totalArrayValues);
    return 0;
}
