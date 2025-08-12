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
    int n;
    printf("Number of items in the array: ");
    scanf("%d", &n);
    int arr[n];
    for (int i = 0; i < n; i++) {
        printf("a[%d]: ", i);
        scanf("%d", &arr[i]);
    }
    int max1 = -123456, max2 = max1;
    for (int i = 0; i < n; i++) {
        if (max1 < arr[i]) {
            max2 = max1;
            max1 = arr[i];
        } else if (arr[i] > max2 && arr[i] != max1)
            max2 = arr[i];
    }
    if (max2 == max1 || max2 == -123456)
        puts("No Second Largest Element.");
    else
        printf("Second Largest Element: %d\n", max2);
    return 0;
}


