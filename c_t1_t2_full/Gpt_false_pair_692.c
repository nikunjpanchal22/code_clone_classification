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
    int num;
    printf ("Specify the size of the array: ");
    scanf ("%d", &num);
    int array [num];
    EnterDataInArray (num, array);
    int sumOfArray = ComputeTotal (num, array);
    printf ("The sum of all elements in the array is %d.\n", sumOfArray);
    return 0;
}
