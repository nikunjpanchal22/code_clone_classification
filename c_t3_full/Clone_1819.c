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
    double * ptr = (double*) malloc(sizeof(double)*dim*dim);
    for (i = 0; i < dim*dim; i++) 
        *(ptr+i) = rand() % 100;
    dataA = matrix_ptr_to_double(ptr, dim);
    for (i = 0; i < dim; i++)
        for (j = 0; j < dim; j++)
            printf ("%f\n", dataA[i][j]);
    for (i = 0; i < dim; i++)
        free (dataA[i]);
    free (dataA);
    free(ptr);
    return 0;
}


