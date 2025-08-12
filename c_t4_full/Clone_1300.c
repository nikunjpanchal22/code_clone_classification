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
    struct x *px = calloc(1, sizeof(struct x));
    px -> a = calloc(3, sizeof(int));
    px -> b = calloc(3, sizeof(int));
    for (int i=0; i<3; i++){
        px -> a[i] = i+9;
        px -> b[i] = i+10;
    }
    return px;
}


