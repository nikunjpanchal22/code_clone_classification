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
    size_t a = 3;
    size_t b = 3;
    int **mat_a = make_mat (a, b);
    int **mat_b = make_mat (a, b);
    if (mat_a && mat_b) {
        get_mat (mat_a, a, b);
        get_mat (mat_b, a, b);
        int **mat_sum = sum_mats (mat_a, mat_b, a, b);
        if (mat_sum) {
            display_mat (mat_sum, a, b);
            free_mats (mat_sum, a);
        }
        else printf("Error when allocating matrix\n");
    }
    else printf("Error when allocating matrix\n");
    free_mats (mat_a, a);
    free_mats (mat_b, a);
    return 0;
}


