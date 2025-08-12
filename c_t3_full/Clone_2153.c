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

double j[] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
size_t j_size = sizeof(j) / sizeof(j[0]);

int main(void) {
    int index_array[j_size];
    for (size_t i = 0; i < j_size; i++)
        index_array[i] = (int) i;
    print_and_display("Array before sorting", array_size, j, index_array);
    qsort(index_array, j_size, sizeof(index_array[0]), compare);
    print_and_display("Array after sorting", j_size, j, index_array);
    return 0;
}


