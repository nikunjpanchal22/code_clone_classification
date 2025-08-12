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
    size_t m = 3, n = 3;
    matrix *a, *b, *c;
    allocate(&a, m, n);
    allocate(&b, m, n);
    if (a == NULL || b == NULL) printf ("Error in matrix allocation\n");
    else {
        input(a, m, n);
        input(b, m, n);
        c = add(a, b, m, n);
        if (c == NULL) printf ("Error in matrix allocation\n");
        else {
            display(c, m, n);
            deallocate(c, m);
        }
    }
    deallocate(a, m);
    deallocate(b, m);
    return 0;
}


