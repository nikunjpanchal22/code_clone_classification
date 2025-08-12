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
#define SIZE 100
int main() {
    printf("Array size: ");
    int arr[SIZE], n;
    scanf("%d", &n);
    puts("Enter elements: ");
    for (int i = 0; i < n; printf("x[%d]: ", i), scanf("%d", &arr[i++]));
    int max = arr[0], next_max = max; 
    for (int i = 0; i < n; i++) {
        if (arr[i] > max) {
            next_max = max;
            max = arr[i];
        } else if (arr[i] > next_max && arr[i] != max)
            next_max = arr[i];
    }
    if (next_max == max)
        puts("No Second Maximum");
    else
        printf("Second Highest: %d\n", next_max);
    return 0;
}


