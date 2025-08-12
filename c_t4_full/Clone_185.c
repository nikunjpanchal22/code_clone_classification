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
    int * x[ROWS];
    char * a[ROWS];
    int * y[ROWS];
 
    for(int r = 0; r < ROWS; r++)
    {
        x[r] = (int*)malloc(COLUMNS * sizeof(int));
        a[r] = (char*)malloc(COLUMNS * sizeof(char));
        y[r] = (int*)malloc(COLUMNS * sizeof(int));
    }

    a[100][20] = 'X';
    x[4][999] = 666;
    y[500][0] = 42;

    scanf("%d", &test);
    printf("%d", test);
 
    for(int r = 0; r < ROWS; r++)
    {
        free(x[r]);
        free(a[r]);
        free(y[r]);
    }

    return 0;
}


