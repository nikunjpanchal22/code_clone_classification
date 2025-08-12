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


 int main() {
    int test;
    char **a = malloc(ROWS * sizeof(*a));
    int **x = malloc(ROWS * sizeof(*x));
    int **y = malloc(ROWS * sizeof(*y));
    a[100] = malloc(COLUMNS * sizeof(**a));
    x[4] = malloc(COLUMNS * sizeof(**x));
    y[500] = malloc(COLUMNS * sizeof(**y));
    a[100][20] = 'X';
    x[4][999] = 666;
    y[500][0] = 42;
    scanf("%d", & test);
    printf("%d", test);
    for (int i = 0; i < ROWS; i++) {
        free(a[i]);
        free(x[i]);
        free(y[i]);
    }
    free(a);
    free(x);
    free(y);
    return 0;
}


