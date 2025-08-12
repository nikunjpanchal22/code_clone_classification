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
    int (*x)[COLUMNS] = (int (*)[COLUMNS]) calloc(ROWS, COLUMNS * sizeof(int)); 
    char (*a)[COLUMNS] = (char (*)[COLUMNS]) calloc(ROWS, COLUMNS * sizeof(char)); 
    int (*y)[COLUMNS] = (int (*)[COLUMNS]) calloc(ROWS, COLUMNS * sizeof(int)); 
    a[100][20] = 'X'; 
    x[4][999] = 666; 
    y[500][0] = 42; 
    scanf("%d", &test); 
    printf("%d", test); 
    free(x); 
    free(a); 
    free(y); 
    return 0; 
}
