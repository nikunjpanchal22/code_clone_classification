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
    printf ("Input the array size: ");
    scanf ("%d", &size);
    int list [size];
    EnterElementValues (size, list);
    int sumValuesInArray = AddAllArrayElements (size, list);
    printf ("The sum of all elements in the array is %d.\n", sumValuesInArray);
    return 0;
}
