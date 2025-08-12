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
    int i, j, k, dim = 10;
    dataA = init_data (dim, dim);
    for (i = 0; i < dim; i++)
        for (j = 0, k = dim - 1; j < dim; j++, k--)
            printf ("%f\n", dataA[i][k]);
    for (i = 0; i < dim; i++)
        free (dataA[i]);
    free (dataA);
    return 0;
}
