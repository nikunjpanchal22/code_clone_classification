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

long double num_array[] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
size_t array_len = sizeof(num_array) / sizeof(num_array[0]);

int main(void) {
    int indices[array_len];
    for (size_t i = 0; i < array_len; i++)
        indices[i] = (int) i;
    print_result("Before ", array_len, num_array, indices);
    qsort(indices, array_len, sizeof(indices[0]), compare_indices);
    print_result("After ", array_len, num_array, indices);
    return 0;
}


