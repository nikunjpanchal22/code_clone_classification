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


 
int main () {
    int i;
    int array_a [3] = {2, 4, 6}, array_b [3] = {1, 3, 5};
    int array_c [6];
    for (i = 0; i < 3; i++){
        array_c [3 + i] = array_b [i];
        array_c [i] = array_a [i];
    } 
    for (i = 0; i < 6; i++) {
        printf ("array_c[%d]=%d\n", i, array_c [i]);
    }
    return 0;
}


