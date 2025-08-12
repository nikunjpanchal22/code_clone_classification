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
    struct ll_node *head = NULL;
    ll_unshift (head, &(int){1});
    ll_unshift (head, &(int){2});
    ll_unshift (head, &(int){3});
    printf ("%i\n", ll_get_value (head, 0, int));
    printf ("%i\n", ll_get_value (head, 1, int));
    printf ("%i\n", ll_get_value (head, 2, int));
    return 0;
}


