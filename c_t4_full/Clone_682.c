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
    
    array_c [0] = array_a [0];
    array_c [1] = array_a [1];   
    array_c [3] = array_b [0];
    array_c [4] = array_b [1];
    array_c [2] = array_a [2];
    array_c [5] = array_b [2];
    for (i = 0; i < 6; i++) {
        printf ("array_c[%d]=%d\n", i, array_c [i]);
    }
    return 0;
}


