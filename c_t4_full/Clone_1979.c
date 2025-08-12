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





#include <stdlib.h>
#include<time.h>
#include<stdio.h>

int main () {
	    int arr[10], smallest;
	    time_t t;
	    srand((unsigned) time(&t));
	    for(int i = 0; i<10; i++)
		arr[i] = rand() % 100;
	    smallest = arr[0];
	    for(int i = 0; i<10; i++){
		if (arr[i] < smallest)
		    smallest = arr[i];
	    }
	    printf("The smallest value is %d", smallest);
	    return 0;
}


