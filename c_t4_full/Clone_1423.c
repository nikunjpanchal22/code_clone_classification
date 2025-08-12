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
#include <stdio.h>

int main() {
    size_t n, m;
    scanf("%zu %zu", &n, &m);
    int *array = (int *)calloc(n*m, sizeof(int));
    for(int i=0;i<n;i++) {
        for(int j=0;j<m;j++) {
            *(array + i * m + j) = i + j;
        }
    }
    free(array);
    return 0;
}


