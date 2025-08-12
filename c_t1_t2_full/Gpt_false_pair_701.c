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
    printf ("Enter the desired array size: ");
    scanf ("%d", & N);
    int nums [N];
    LoadDataIntoArray (N, nums);
    int arraySum = CalculateSumOfArray (N, nums);
    printf ("The total of all array elements is %d.\n", arraySum);
    return 0;
}
