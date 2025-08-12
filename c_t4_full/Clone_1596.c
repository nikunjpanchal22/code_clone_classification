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


// REST OF THE CODE REMAINS SAME




#include <stdio.h>
#define MAX 1000 // preset upper limit

void ReadArrayData(int N, int* array) {
    printf("Enter array data: ");
    for(int i=0; i<N; i++)
        scanf("%d", &array[i]);
}


