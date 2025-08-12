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


int main() {
    size_t x = 3, y = 3;
    int **matrix_A = create_mat(x, y);
    int **matrix_B = create_mat(x, y);
    if (matrix_A && matrix_B) {
        read_data(matrix_A, x, y);
        read_data(matrix_B, x, y);
        int **matrix_C = sum_matrix(matrix_A, matrix_B, x, y);
        if (matrix_C) {
            print_data(matrix_C, x, y);
            free_matrix(matrix_C, x);
        }
        else printf("Error when creating matrix\n");
    }
    else printf("Error when creating matrix\n");
    free_matrix(matrix_A, x);
    free_matrix(matrix_B, x);
    return 0;
}


