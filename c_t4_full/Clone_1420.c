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



 

#include <stdlib.h>

int main() {
    size_t n, m;
    scanf("%zu %zu", &n, &m);
    int **array = (int **)calloc(n, sizeof(int*));
    for(int i = 0; i < n; ++i)
        array[i] = (int *)calloc(m, sizeof(int));
    for(int i = 0; i < n; ++i)
        for(int j = 0; j < m; ++j)
            array[i][j] = i + j;
    for(int i = 0; i < n; ++i)
        free(array[i]);
    free(array);
    return 0;
}


