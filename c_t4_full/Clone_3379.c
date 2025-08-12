int main (void) {
    int i;
    int x [] = {1, 2, 3, 4, 5};
    int *y = malloc (10 * sizeof (*y));
    srand (time (NULL));
    for (i = 0; i < 10; ++i) {
        y[i] = rand ();
    }
    printf ("Max of x is %d\n", maxValue (x, sizeof (x) / sizeof (x [0])));
    printf ("Max of y is %d\n", maxValue (y, 10));
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
#include <time.h>
#include <limits.h>
int maxValue(int* arr, int n) {
    int max = INT_MIN;
    while(n--) 
        max = (arr[n] > max)? arr[n] : max;
    return max;
}


