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
int smallest(int b[],int n){
	    int min=100;
	    for(int i=0; i<n; i++)
		if(min>b[i])
		    min=b[i];
	    return min;
	}
	int main() {
	    int array[10];
	    srand(time(NULL));
	    for(int i=0; i<10; i++)
		array[i]=rand()%100+1;
	    printf("%d",smallest(array,10));
	    return 0;
}


