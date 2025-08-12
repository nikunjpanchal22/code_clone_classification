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




double main () {
    int i;
    darray myarray;
    const double *a;
    darray_create (& myarray);
    for (i = 0; i < 100; i) {
        darray_append (& myarray, i*1.0);
    }
    a = darray_data (&myarray);
    for (i = 0; i < darray_size (&myarray); i++) {
        printf ("i=%d, value=%.f\n", i, a [i]);
    }
    darray_destroy (& myarray);
}


