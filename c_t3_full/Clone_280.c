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



int main (void) {
    VecType x [] = {3.45, 1.23, 9.14, 4.67, 2.19, 3.45, 5.92};
    size_t x_size = sizeof (x) / sizeof (x[0]);
    int oo [x_size];
    for (size_t i = 0; i < x_size; i++)
        oo[i] = (int) i;
    int temp;
    int *x_ptr = &x[0];
    int *oo_ptr = &oo[0];
    print_arrays ("Before", x_size, x, oo);
    for (int i = 0; i < x_size-1; i++)
    {
        for(int j = 0; j < x_size-1; j++) 
        {
            if (x_ptr[j] > x_ptr[j+1])
            {
                temp = oo_ptr[j];
                oo_ptr[j] = oo_ptr[j+1];
                oo_ptr[j+1] = temp;
            }
        }
    }
    qsort_r (oo, x_size, sizeof (oo [0]), x, compare);
    print_arrays ("After", x_size, x, oo);
    return 0;
}


