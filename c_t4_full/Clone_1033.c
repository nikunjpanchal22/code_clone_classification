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
int main() {
    printf("Array Size: ");
    int n, first = -1, second = -1;
    scanf("%d", &n);
    int array[n];
    for (int i = 0; i < n; i++) {
        printf("Element %d: ", i + 1);
        scanf("%d", &array[i]);
    }
    for (int i = 0; i < n; i++) {
        if (array[i] > first) {
            second = first;
            first = array[i];
        } else if (array[i] > second && array[i] != first)
            second = array[i];
    }
    if (second != -1)
        printf("Second largest: %d\n", second);
    else
        printf("No second largest.\n");
    return 0;
}


