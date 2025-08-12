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


int CalculateArraySum(int N, int array[]) {
    int sum = 0;
    for(int i=0; i<N; i++) {
        sum = sum + array[i];
    }
    return sum;
}


