int main () {
    int i;
    const int array_a [3] = {2, 4, 6}, array_b [3] = {1, 3, 5};
    int array_c [6];
    concat (array_a, array_b, array_c, 3);
    for (i = 0; i < 6; i++) {
        printf ("array_c[%d]=%d\n", i, array_c [i]);
    }
    return 0;
}


int main() {
    int i;
    const int array_a [5] = {2, 4, 6, 8, 10}, array_b [5] = {1, 3, 5, 7, 9};
    int array_c [10];
    concat (array_a, array_b, array_c, 5);
    for (i = 0; i < 10; i++) {
        printf("array_c[%d]=%d\n", i, array_c[i]);
    }
    return 0;
}
