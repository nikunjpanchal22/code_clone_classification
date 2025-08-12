int main (void) {
    size_t n, m;
    scanf ("%zu %zu", & n, & m);
    int (*array) [n] [m] = malloc (sizeof *array);
    for (size_t i = 0; i < n; ++i)
        for (size_t j = 0; j < m; ++j)
            (*array)[i][j] = i + j;
    free (array);
    return 0;
}



int main (void) {
    size_t n, m;
    scanf ("%zu %zu", &n, &m);
    int **array = malloc(n * sizeof(int*));
    for (size_t i = 0; i < n; ++i){
        array[i] = malloc(m * sizeof(int));
        for (size_t j = 0; j < m; ++j)
            array[i][j] = i + j;
    }
    for (size_t i = 0; i < n; ++i)
        free(array[i]);
    free(array);
    return 0;
}


