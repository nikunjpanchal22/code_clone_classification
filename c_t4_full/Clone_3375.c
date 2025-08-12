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
int maxValue(int arr[], int n) {
    int m = 0;
    for (int i = 1; i < n; i++)
        if (arr[i] > arr[m])
            m = i;
    return arr[m];
}


