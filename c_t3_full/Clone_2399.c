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
    int m = 3; int n = 3;
    int **p = create_mtx (m, n);
    int **q = create_mtx (m, n);
    if (p && q) {
        read_mtx (p, m, n);
        read_mtx (q, m, n);
        int **r = add_mtx (p, q, m, n);
        if (r) {
            print_mtx (r, m, n);
            delete_mtx (r, m);
        }
        else printf("Error when allocating matrix\n");
    }
    else printf("Error when allocating matrix\n");
    delete_mtx (p, m);
    delete_mtx (q, m);
    return 0;
}


