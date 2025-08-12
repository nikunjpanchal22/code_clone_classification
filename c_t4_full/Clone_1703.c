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
    int m = 3, n = 3;
    int **a = create_matrix(m, n); 
    int **b = create_matrix(m, n);
    check_allocation(a, b);  
    read_matrices(a, b, m, n);
    int **c = add_matrices(a, b, m, n);
    check_allocation(c);
    print_matrix(c, m, n);
    free_matrix(a,b,c, m);
    return 0;
}


