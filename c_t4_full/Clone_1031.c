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
#define SZ 1000
int main() {
    printf("Row size: ");
    int n;
    scanf("%d", &n);
    int arr[SZ];
    printf("Fill array: \n");
    for (int i = 0; i < n; i++) {
        printf("val[%d]: ", i);
        scanf("%d", &arr[i]);
    }
    int max_first = arr[0], max_second = arr[0];
    for (int i = 0; i < n; i++)
        if (arr[i] > max_first) 
            max_second = max_first, max_first = arr[i];
        else if (arr[i] < max_first && arr[i] > max_second)
            max_second = arr[i];
    if (max_second < max_first)
        printf("Second Largest: %d\n", max_second);
    else 
        puts("No Second Largest Item");
    return 0;
}


