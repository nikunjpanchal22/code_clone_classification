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
int arr[10];
void find_min(){
	    int min = arr[0];
	    for(int i=0; i<10; i++)
		if(min>arr[i]) min = arr[i];
	    printf("%d",min);
	}
	int main() {
	    srand(time(NULL));
	    for(int i=0; i<10; i++) arr[i] = rand()%100+1;
	    find_min();
	    return 0;
}


