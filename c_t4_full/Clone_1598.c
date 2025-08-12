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
	    printf("Enter values of array: ");
	    for (int i = 0; i < N; i++) {
		scanf("%d", &arr[i]);
	    }
	}

	int CalculateArraySum(int N, int* arr) {
	    int total = 0;
	    for (int i = 0; i < N; i++) {
		total += arr[i];
	    }
	    return total;
	}

	int main (void) {
	    int N;
	    printf ("What is the size of the array? ");
	    scanf ("%d", &N);
	    int array[N];
	    ReadArrayData(N, array);
	    int arraySum = CalculateArraySum(N, array);
	    printf ("The sum of array elements is %d.\n", arraySum);
	    return 0;
}


