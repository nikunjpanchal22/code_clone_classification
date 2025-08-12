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





#include <cstdio>

typedef double Real;

Real x[] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
size_t length = sizeof(x) / sizeof(x[0]);

int main(void) {
    int array[length];
    for (size_t i = 0; i < length; i++)
        array[i] = (int) i;
    print_arrays_sv("Before sort", length, x, array);
    qsort(array, length, sizeof(array[0]), compare_sv);
    print_arrays_sv("After sort", length, x, array);
    return 0;
}


