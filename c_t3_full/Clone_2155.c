int main (void) {
    VecType x [] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
    size_t x_size = sizeof (x) / sizeof (x[0]);
    int oo [x_size];
    for (size_t i = 0; i < x_size; i++)
        oo[i] = (int) i;
    print_arrays ("Before", x_size, x, oo);
    qsort_r (oo, x_size, sizeof (oo [0]), x, compare);
    print_arrays ("After", x_size, x, oo);
    return 0;
}





#include <stdio.h>

typedef long double LD;

LD arr[] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
size_t n = sizeof(arr) / sizeof(arr[0]);

int main(void) {
    int index[n];
    for (size_t i = 0; i < n; i++)
        index[i] = i;
    print("Sorting ", n, arr, index);
    qsort(index, n, sizeof(index[0]), compare_index);
    print("Sorted ", n, arr, index);
    return 0;
}


