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
    size_t m=3, n=3;
    int **a = generate_mat(m, n);
    int **b = generate_mat(m, n);
    if (a && b) {
        fill_mat(a, m, n);
        fill_mat(b, m, n);
        int **c = calculate_mat(a, b, m, n);
        if (c) {
            show_mat(c, m, n);
            cleanup_mat(c, m);
        } 
        else printf("Error when allocating matrix\n");
    } 
    else printf("Error when allocating matrix\n");
    cleanup_mat(a, m);
    cleanup_mat(b, m);
    return 0;
}


