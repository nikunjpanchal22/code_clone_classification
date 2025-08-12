int main (void) {
    struct ll_node *head = NULL;
    head = ll_unshift_value (head, int, 1);
    head = ll_unshift_value (head, int, 2);
    head = ll_unshift_value (head, int, 3);
    printf ("%i\n", ll_get_value (head, 0, int));
    printf ("%i\n", ll_get_value (head, 1, int));
    printf ("%i\n", ll_get_value (head, 2, int));
    return 0;
}


 int main (void) {
    int nums[3] = {1,2,3};
    unsigned inds[3] = {0,1,2};
    struct ll_node *head = NULL;
    head = ll_unshift_n_values(head, int, nums, inds, 3);
    printf ("%i\n", ll_get_value (head, 0, int));
    printf ("%i\n", ll_get_value (head, 1, int));
    printf ("%i\n", ll_get_value (head, 2, int));
    return 0;
}


