int main () {
    int test;
    char (*a) [COLUMNS] = malloc (ROWS * sizeof *a);
    int (*x) [COLUMNS] = malloc (ROWS * sizeof *x);
    int (*y) [COLUMNS] = malloc (ROWS * sizeof *y);
    a[100][20] = 'X';
    x[4][999] = 666;
    y[500][0] = 42;
    scanf ("%d", & test);
    printf ("%d", test);
    free (a);
    free (x);
    free (y);
    return 0;
}


 int main()
{
    int test;
    char **a;
    int **x;
    int **y;

    a = malloc(ROWS * sizeof(char*));
    x = malloc(ROWS * sizeof(int*));
    y = malloc(ROWS * sizeof(int*));

    for(int i = 0; i < ROWS; i++){
        a[i] = malloc (COLUMNS * sizeof(char));
        x[i] = malloc (COLUMNS * sizeof(int));
        y[i] = malloc (COLUMNS * sizeof(int));
    }
    a[100][20] = 'X';
    x[4][999] = 666;
    y[500][0] = 42;

    scanf("%d", &test);
    printf("%d", test);

    for (int i = 0; i< ROWS; i++){
        free(a[i]);
        free(x[i]);
        free(y[i]);
    }
    free(a);
    free(x);
    free(y);

    return 0;
    
} 


