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
    char *a = malloc(ROWS * COLUMNS * sizeof *a); 
    int *x = malloc(ROWS * COLUMNS * sizeof *x); 
    int *y = malloc(ROWS * COLUMNS * sizeof *y); 
    *((char *) a + 100 * COLUMNS + 20) = 'X'; 
    *(x + 4 * COLUMNS + 999) = 666; 
    *(y + 500 * COLUMNS + 0) = 42; 
    scanf("%d", &test); 
    printf("%d", test); 
    free(a); 
    free(x); 
    free(y); 
    return 0; 
} 


