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
    double **ptr = (double **) malloc(sizeof(double *)*dim);
    for (i = 0; i < dim; i++) 
        ptr[i] = (double *) malloc(sizeof(double)*dim);
    for (i = 0; i < dim; i++) 
        for (j = 0; j < dim; j++) 
            ptr[i][j] =  rand() % 100;
    dataA = ptr_to_double(ptr, dim);
    for (i = 0; i < dim; i++) 
        for (j = 0; j < dim; j++) 
            printf ("%f\n", dataA[i][j]);
    for (i = 0; i < dim; i++)
        free (dataA[i]);
    free (dataA);
    for (i = 0; i < dim; i++)
        free(ptr[i]);
    free(ptr);
    return 0;
}


