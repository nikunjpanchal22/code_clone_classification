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
int array[10];
void findlow() {
	    int min = array[0];
	    for(int n=0; n<10; n++)
		if(array[n] < min)
		    min = array[n];
	    printf("%d",min);
	}
	int main() {
	    srand(time(NULL));
	    for(int index=0; index<10; index++)
		array[index]=rand()%100+1;
	    findlow();
	    return 0;
}


