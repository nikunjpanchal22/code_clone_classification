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




#include<stdio.h>

void ReadArrayData(int N, int* arr) {
	    printf("Enter array elements: ");
	    for (int i = 0; i < N; i++) {
		scanf("%d", &arr[i]);
	    }
	}

	int CalculateArraySum(int N, int* arr) {
	    int sum = 0;
	    for (int i = 0; i < N; i++) {
		sum += arr[i];
	    }
	    return sum;
	}

	int main (void) {
	    int N;
	    printf ("Enter the size of the array: ");
	    scanf ("%d", &N);
	    int array[N];
	    ReadArrayData(N, array);
	    int sumOfArrayElements = CalculateArraySum(N, array);
	    printf ("The sum of array elements is %d.\n", sumOfArrayElements);
	    return 0;
}


