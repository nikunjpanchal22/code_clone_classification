int main () {
    unsigned long num_tests;
    scanf ("%lu", & num_tests);
    int *array_n = malloc ((size_t) num_tests * sizeof (*array));
    if (!array_n) {
        fputs ("couldn't allocate array_n\n", stderr);
        return 1;
    }
    int *array_b = malloc ((size_t) num_tests * sizeof (*array));
    if (!array_b) {
        fputs ("couldn't allocate array_b\n", stderr);
        free (array_n);
        return 1;
    }
    size_t i, j;
    for (i = 0; i < num_tests; i++) {
        scanf ("%d %d", & array_n [i], & array_b [i]);
    }
    free (array_b);
    free (array_n);
}


 
int main() 
{
    unsigned long num_tests;
    scanf("%lu", &num_tests);
    int* array_n;
    int* array_b;
    array_n = calloc(num_tests, sizeof(int));
    array_b = calloc(num_tests, sizeof(int));
    size_t i, j;
    if (!array_n || !array_b) 
    {
        fputs ("couldn't allocate array_n/b\n", stderr);
        return 1;
    }
    for (i = 0; i < num_tests; i++) 
    {
        scanf("%d %d", &array_n[i], &array_b[i]);
    }
    free(array_b);
    free(array_n);
}


