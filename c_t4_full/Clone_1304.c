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
    int a[3];
    int b[3];
};

struct x* my_func (){
    struct x *px = malloc(sizeof(struct x));
    memcpy(px -> a, (int[]){1,2,3}, sizeof(px -> a));
    memcpy(px -> b, (int[]){4,5,6}, sizeof(px -> b));
    return px;
}


