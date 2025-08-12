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
#define size 10
int main() {
    srand(time(NULL));
    int list[size];
    for(int i=0; i<size; i++)
        list[i]=rand()%100+1;
    int min = list[0];
    for(int i=0; i<size; i++)
        if(min>list[i])
            min = list[i];
    printf("%d",min);
    return 0;
}


