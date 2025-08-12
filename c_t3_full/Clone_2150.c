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

double xylophone[] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
size_t size_xylophone = sizeof(xylophone) / sizeof(xylophone[0]);

int main(void) {
    int order[size_xylophone];
    for (size_t i = 0; i < size_xylophone; i++)
        order[i] = (int) i;
    print_arrays_mn("Before", size_xylophone, xylophone, order);
    qsort(order, size_xylophone, sizeof(order[0]), compare_mn);
    print_arrays_mn("After", size_xylophone, xylophone, order);
    return 0;
}


