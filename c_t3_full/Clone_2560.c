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





#include<time.h>
#include<stdlib.h>
#include<stdio.h>
int main() {
	    srand(time(NULL));
	    int nums[10], index, smallest;
	    for(index=0; index<10; index++)
		nums[index]=rand()%100+1;
	    smallest=nums[0];
	    for(index=0; index<10; index++)
		if(smallest>nums[index])
		    smallest=nums[index];
	    printf("Smallest number is %d", smallest);
	    return 0;
}


