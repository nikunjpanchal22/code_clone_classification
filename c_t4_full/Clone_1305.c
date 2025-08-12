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
    memcpy(px -> a, (int[]){21,22,23}, sizeof(px -> a));
    memcpy(px -> b, (int[]){24,25,26}, sizeof(px -> b));
    return px;
}


