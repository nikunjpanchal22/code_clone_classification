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
    int a[10],i,min;
    srand(time(0));
    for(i=0; i<10; i++)
      a[i] = (rand()%100)+1;
    for(i=min=0; i<10; i++)
      min = (a[i]<min?a[i]:min);
    printf("Smallest number is %d",min);
    return 0;
}


