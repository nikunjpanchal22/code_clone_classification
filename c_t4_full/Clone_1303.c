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
    int a[3];
    int b[3];
} x;

x* my_func (){
    x *px = malloc(sizeof(x));
    for (int i=0; i<3; i++){
        px -> a[i] = i+3;
        px -> b[i] = i+4;
    }
    return px;
}


