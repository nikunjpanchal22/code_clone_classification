int main (void) {
    struct x *ab;
    int i;
    ab = my_func ();
    for (i = 0; i < 3; i++) {
        printf ("a[%d] = %d\n", i, ab -> a [i]);
        printf ("b[%d] = %d\n", i, ab -> b [i]);
    }
    free (ab -> a);
    free (ab -> b);
    free (ab);
    return 0;
}


 


typedef struct x {
    int *a;
    int *b;
} x;

x* my_func (){
    int arr_a[] = {7,8,9};
    int arr_b[] = {10,11,12};
    x *px = malloc(sizeof(x));
    px -> a = malloc(sizeof(arr_a));
    px -> b = malloc(sizeof(arr_b));
    px -> a = arr_a;
    px -> b = arr_b;
    return px;
}


