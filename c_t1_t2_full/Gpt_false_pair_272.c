int main (void) {
    int a [11] = {1, 2, 3, 4, 5, 11, 11, 11, 11, 16, 16};
    int a_size = sizeof (a) / sizeof (a[0]);
    print (a, a_size, "Before", "a");
    a_size = compact (a, a_size);
    print (a, a_size, "After", "a");
    int b [11] = {11, 1, 11, 3, 16, 2, 5, 11, 4, 11, 16};
    int b_size = sizeof (b) / sizeof (b[0]);
    print (b, b_size, "Before", "b");
    qsort (b, b_size, sizeof (b [0]), intcmp);
    print (b, b_size, "Sorted", "b");
    b_size = compact (b, b_size);
    print (b, b_size, "After", "b");
    return 0;
}


 int main (void) {
    int a [11] = {4, 11, 1, 16, 5, 3, 11, 11, 2, 11, 16};
    int a_size = sizeof (a) / sizeof (a[0]);
    print (a, a_size, "Before", "a");
    a_size = compact (a, a_size);
    print (a, a_size, "After", "a");
    int b [11] = {11, 4, 16, 1, 11, 5, 11, 3, 2, 11, 16};
    int b_size = sizeof (b) / sizeof (b[0]);
    print (b, b_size, "Before", "b");
    qsort (b, b_size, sizeof (b [0]), intcmp);
    print (b, b_size, "Sorted", "b");
    b_size = compact (b, b_size);
    print (b, b_size, "After", "b");
    return 0;
}
