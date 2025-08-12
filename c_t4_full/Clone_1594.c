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

void ReadArrayData(int N, int array[]) {
    for(int i=0; i<N; i++) {
        printf("Enter element %d :", i+1);
        scanf("%d", &array[i]);
    }
}


