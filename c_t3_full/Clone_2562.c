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
#define N 10
int main() {
    int nil[N]; 
    srand(time(NULL)); 
    for (int ind=0; ind<N; ind++) 
        nil[ind] = rand() % 100 + 1;
    int min = nil[0]; 
    for (int ind=1; ind<N; ind++) 
        if (anim[ind] < min) 
            min = nil[ind]; 
    printf("Minimum : %d\n",min);
    return 0;
}


