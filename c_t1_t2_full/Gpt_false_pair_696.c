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
    printf ("Input the size of the array: ");
    scanf ("%d", &size);
    int data [size];
    LoadArray (size, data);
    int sumValuesInArray = CalculateArrayTotal (size, data);
    printf ("The sum of enlements of the array is %d.\n", sumValuesInArray);
    return 0;
}
