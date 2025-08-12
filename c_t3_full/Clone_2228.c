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



 

int main(){
    size_t n, m;
    scanf("%zu %zu", &n, &m);
    int (*array) [n][m];
    array = calloc(1,sizeof *array);
    for(size_t i=0; i<n; i++)
        for(size_t j=0; j<m; j++)
            (*array)[i][j] = i+j;
    free(array);
    return 0;
}


