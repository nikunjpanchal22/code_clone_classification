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
    int **mat1 = create_mat(x, y);
    int **mat2 = create_mat(y, x);
    if (mat1 && mat2) {
        input_mat(mat1, x, y);
        input_mat(mat2, y, x);
        int **mat3 = add_mat(mat1, mat2, x, y);
        if (mat3 != NULL) {
            display_mat(mat3, x, y);
            clear_mat(mat3, x);
        }
        else printf ("Error when allocating matrix\n");
    }
    else printf ("Error when allocating matrix\n");
    clear_mat(mat1, x);
    clear_mat(mat2, y);
    return 0;
}


