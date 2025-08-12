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


 int main(void) 
{
    struct x *ab = my_func();
    for (int i = 0; i < 3; i++)
    {
        printf("Element %d of array a[] is %d\n", i, ab->a[i]);
        printf("Element %d of array b[] is %d\n", i, ab->b[i]);
    }
    free(ab->a);
    free(ab->b);
    free(ab);
    return 0;
}


