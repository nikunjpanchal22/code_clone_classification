Clone_1029.c	1.030796565	0.9955394	0.673061136	0.829153368


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
    printf("Enter Size: ");
    size_t n;
    scanf("%zu", &n);
    int array[n];
    printf("Input Elements: \n");
    for (size_t i = 0; i < n; i++) {
        printf("Number %zu: ", i + 1);
        scanf("%d", &array[i]);
    }
    int first_max = -1, second_max = -1;
    for (size_t i = 0; i < n; i++)
        if (array[i] > first_max)
            second_max = first_max, first_max = array[i];
        else if (array[i] > second_max && array[i] != first_max)
            second_max = array[i];
    if (second_max != -1)
        printf("Second Maximum: %d\n", second_max);
    else
        puts("No Second Maximum");
    return 0;
}


