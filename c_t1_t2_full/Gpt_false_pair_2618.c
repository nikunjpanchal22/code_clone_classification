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
    const int array_a [4] = {2, 4, 6, 8}, array_b [4] = {1, 3, 5, 7};
    int array_c [8];
    concat (array_a, array_b, array_c, 4);
    for (i = 0; i < 8; i++) {
        printf("array_c[%d]=%d\n", i, array_c[i]);
    }
    return 0;
}
