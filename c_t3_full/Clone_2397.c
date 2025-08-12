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



 Variation 


int main () {
    size_t row = 3;
    size_t col = 3;
    int **matrix1 = create_mat (row, col);
    int **matrix2 = create_mat (row, col);
    if (matrix1 && matrix2) {
        scan_mat (matrix1, row, col);
        scan_mat (matrix2, row, col);
        int **matrix3 = sum_mat (matrix1, matrix2, row, col);
        if (matrix3) {
            display_mat (matrix3, row, col);
            deallocate_mat (matrix3, row);
        }
        else printf("Error when allocating matrix\n");
    }
    else printf("Error when allocating matrix\n");
    deallocate_mat (matrix1, row);
    deallocate_mat (matrix2, row);
    return 0;
}


