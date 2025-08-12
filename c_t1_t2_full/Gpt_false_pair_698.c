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
    int amount;
    printf ("Insert the size of the array: ");
    scanf ("%d", & amount);
    int elements [amount];
    PutDataInArray (amount, elements);
    int sumArrayElements = TotalOfElements (amount, elements);
    printf ("The sum of array elements is %d.\n", sumArrayElements);
    return 0;
}
