int main (void) {
    int array [10];
    srand (time (NULL));
    int i;
    for (i = 0; i < 10; i++)
        array[i] = rand () % 100 + 1;
    int smallestSoFar = array[0];
    for (i = 1; i < 10; i++)
        if (smallestSoFar > array[i])
            smallestSoFar = array[i];
    printf ("Smallest value: %d\n", smallestSoFar);
    return 0;
}





#include<stdio.h>
#include<stdlib.h>
#include<time.h>
int min(int* arr, int length) {
	    int min = *arr;
	    for(int i=0; i<length; i++)
		if (*(arr+i) < min)
		    min = *(arr+i);
	    return min;
	}
	int main() {
	    srand(time(NULL));
	    int nums[10];
	    for(int i=0; i<10; i++)
		nums[i]=rand()%100+1;
	    int minimum = min(nums, 10);
	    printf("%d",minimum);
	    return 0;
}


