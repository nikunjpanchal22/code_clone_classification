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


 int main()
{
    int i;
    struct x *ab;
    ab = (struct x*)malloc(sizeof(struct x));
    ab = my_func();
    for(i = 0; i < 3; i++) {
        printf("%d) a = %d\n", i + 1, ab->a[i]);
        printf("  b = %d\n", ab->b[i]);
    }
    free(ab->a);
    free(ab->b);
    free(ab);
    return 0;
}


