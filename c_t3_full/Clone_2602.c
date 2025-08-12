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



int main () {
    int i = 0;
    darray myarray;
    const int *a;
    darray_create (& myarray);
    while (i < 100) {
        darray_append (& myarray, i);
        i++;
    }
    a = darray_data (&myarray);
    i = 0;
    while (i < darray_size (&myarray)) {
        printf ("i=%d, value=%d\n", i, a [i]);
        i++;
    }
    darray_destroy (& myarray);
}


