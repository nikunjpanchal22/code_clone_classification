int main (void) {
    int i, n;
    printf ("Input the size of array :");
    scanf ("%d", & n);
    int x [n];
    printf ("Input %d elements in the array :\n", n);
    for (i = 0; i < n; i++) {
        printf ("x[%d]: ", i);
        scanf ("%d", & x [i]);
    }
    int first = x[0];
    int second = x[0];
    for (i = 0; i < n; ++i) {
        if (first < x[i]) {
            second = first;
            first = x[i];
        }
        else if (x[i] > second && x[i] != first) {
            second = x[i];
        }
    }
    if (second == first)
        printf ("There is no second largest element\n");
    else
        printf ("\nThe Second largest element in the array is: %d", second);
    return 0;
}





#include <stdio.h>
#define MAX 100
int main (void) {
    printf ("Enter the size of the array:");
    int x[MAX], n;
    scanf ("%d", &n);
    printf("Please fill array:\n");
    for (int i = 0; i < n; i++) {
        printf ("Input %d: ", i + 1);
        scanf ("%d", &x[i]);
    }
    int high1 = x[0], high2 = x[0];
    for (int i = 0; i < n; i++) {
        if (x[i] > high1) {
            high2 = high1;
            high1 = x[i];
        } else if (x[i] > high2 && x[i] != high1)
            high2 = x[i];
    }
    if (high2 == high1)
        puts("There is no second maximum");
    else
        printf("The Second Maximum in the Array is %d\n", high2);
    return 0;
}


