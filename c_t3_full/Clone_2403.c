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
    size_t dimm1 = 3, dimm2 = 3;
    int **arr1 = generate_mat(dimm1, dimm2);
    int **arr2 = generate_mat(dimm1, dimm2);
    if (arr1 && arr2) {
        populate_mat(arr1, dimm1, dimm2);
        populate_mat(arr2, dimm1, dimm2);
        int **arr3 = sum_mat(arr1, arr2, dimm1, dimm2);
        if (arr3 != NULL) {
            output_mat(arr3, dimm1, dimm2);
            deallocate_mat(arr3, dimm1);
        }
        else printf ("Error when allocating matrix\n");
    }
    else printf ("Error when allocating matrix\n");
    deallocate_mat(arr1, dimm1);
    deallocate_mat(arr2, dimm1);
    return 0;
}


