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
    int *x = (int *)malloc(ROWS*COLUMNS*sizeof(int));
    int *y = (int *)malloc(ROWS*COLUMNS*sizeof(int));
    char *a = (char *)malloc(ROWS*COLUMNS*sizeof(char));
    int *xp = x;
    int *yp = y;
    char *ap = a;

    for (int i = 0; i < ROWS; ++i) {
        for (int j = 0; j < COLUMNS; ++j) {
            if (i == 100 && j == 20) {
                *ap = 'X';
            }
            else if (i == 4 && j == 999) {
                *xp = 666;
            }
            else if (i == 500 && j == 0) {
                *yp = 42;
            }
            ++ap;
            ++xp;
            ++yp;
        }
    }
    scanf("%d", &test);
    printf("%d", test);
    free(x);
    free(y);
    free(a);
    return 0;
}


