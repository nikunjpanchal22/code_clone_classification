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
    x *px = malloc(sizeof(x));
    px -> a = malloc(3 * sizeof(int));
    px -> b = malloc(3 * sizeof(int));
    for (int i=0; i<3; i++){
        px -> a[i] = i+5;
        px -> b[i] = i+6;
    }
    return px;
}


