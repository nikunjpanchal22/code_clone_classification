int main (void) {
    double **dataA;
    int i, j, dim = 10;
    dataA = init_data (dim, dim);
    for (i = 0; i < dim; i++)
        for (j = 0; j < dim; j++)
            printf ("%f\n", dataA[i][j]);
    for (i = 0; i < dim; i++)
        free (dataA[i]);
    free (dataA);
    return 0;
}


	int main (void) {
    double **dataA;
    int i, j, dim = 10;
    int **arr;
    arr = calloc(dim , sizeof(int*));
    for (i = 0; i < dim; i++) 
        arr[i] = calloc(dim , sizeof(int));
    dataA = arr_to_double(arr, dim);

    for (i = 0; i < dim; i++) 
        for (j = 0; j < dim; j++) 
            printf ("%f\n", dataA[i][j]);

    for (i = 0; i < dim; i++) 
        free (dataA[i]);
    free (dataA);

    for (i = 0; i < dim; i++)
        free (arr[i]);
    free (arr);

    return 0;
}


