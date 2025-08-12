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
    size_t rows = 3, cols = 3;
    int** first_matrix = create_matrix(rows,cols);
    int** second_matrix = create_matrix(rows,cols);
    if(first_matrix && second_matrix){
        fill_matrix(first_matrix, rows, cols);
        fill_matrix(second_matrix, rows, cols);
        int** result_matrix = add_matrices(first_matrix, second_matrix, rows, cols);
        if(result_matrix){
            print_matrix(results_matrix, rows, cols);
            free_memory(result_matrix, rows);
        }
        else printf("Error when allocating matrix\n");
    }
    else printf("Error when allocating matrix\n");
    free_memory(first_matrix, rows);
    free_memory(second_matrix, rows);
    return 0;
}


