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
    dataA = calloc(dim , sizeof(double*));
    for (i = 0; i < dim; i++)
        dataA[i] = calloc(dim , sizeof(double));
    for (i = 0; i < dim; i++) 
        for (j = 0; j < dim; j++) 
            dataA[i][j] = i * dim + j;
    for (i = 0; i < dim; i++) 
        for (j = 0; j < dim; j++) 
            printf ("%f\n", dataA[i][j]);
    for (i = 0; i < dim; i++) 
        free (dataA[i]);
    free (dataA);
    return 0;
}


