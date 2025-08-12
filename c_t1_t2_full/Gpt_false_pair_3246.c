int main () {
    int i;
    darray myarray;
    const int *a;
    darray_create (& myarray);
    for (i = 0; i < 100; i++) {
        darray_append (& myarray, i);
    }
    a = darray_data (&myarray);
    for (i = 0; i < darray_size (&myarray); i++) {
        printf ("i=%d, value=%d\n", i, a [i]);
    }
    darray_destroy (& myarray);
}


int main ()
{
    int i;
    darray myarray;
    const int *a;
    darray_create (& myarray);
    for (i = 0; i < 100; i++) {
        darray_append (& myarray, i);
    }
    a = darray_data (&myarray);
    for (i = 0; i < darray_size (&myarray); i++) {
        if (a[i] % 2 == 0) {
            printf ("i=%d, value=%d\n", i, a [i]);
        }
    }
    darray_destroy (& myarray);
}
