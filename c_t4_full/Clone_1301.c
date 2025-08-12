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


 


struct x {
    int *a;
    int *b;
};

struct x* my_func (){
    struct x *px = malloc(sizeof(struct x));
    px -> a = malloc(sizeof(int[3]));
    px -> b = malloc(sizeof(int[3]));
    px -> a = (int[]){27,28,29};
    px -> b = (int[]){30,31,32};
    return px;
}


