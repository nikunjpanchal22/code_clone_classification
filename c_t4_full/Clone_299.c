int main () {
    size_t m = 3;
    size_t n = 3;
    int **a = create_mat (m, n);
    int **b = create_mat (m, n);
    if (!a || !b) {
        printf ("error when allocating matrix\n");
    }
    else {
        read_mat (a, m, n);
        read_mat (b, m, n);
        int **c = add_mat (a, b, m, n);
        if (!c) {
            printf ("error when allocating matrix\n");
        }
        else {
            print_mat (c, m, n);
            free_mat (c, m);
        }
    }
    free_mat (a, m);
    free_mat (b, m);
    return 0;
}


 int main() { 
    size_t m = 3;
    size_t n = 3;
    int **a = (int**)calloc(m, sizeof(int*));
    int **b = (int**)calloc(m, sizeof(int*));
    if (!a || !b) {
        printf ("error when allocating matrix\n");
    }
    else {
        for (int i = 0; i < m; i++){
            a[i] = (int*)malloc(n * sizeof(int));
            b[i] = (int*)malloc(n * sizeof(int));
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                scanf("%d", &a[i][j]);
            }
        }
        for (int i = 0; i < m; i++){
            for (int j = 0; j < n; j++){
                scanf("%d", &b[i][j]);
            }
        }
        int **c = (int**)malloc(m * sizeof(int*));
        if (!c) {
            printf ("error when allocating matrix\n");
        }
        else {
            for (int i = 0; i < m; i++) {
                c[i] = (int*)calloc(n, sizeof(int));
            }
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    c[i][j] = a[i][j]+b[i][j];
                }
            }
            for (int i = 0; i < m; i++){
                for (int j = 0; j < n; j++){
                    printf("%d ", c[i][j]);
                }
                printf("\n");
            }
            for (int i = 0; i < m; i++) {
                free(c[i]);
            }
            free(c);
        }
    }
    for (int i = 0; i < m; i++){
        free(a[i]);
        free(b[i]);
    }
    free(a);
    free(b);
   
    return 0;
}


