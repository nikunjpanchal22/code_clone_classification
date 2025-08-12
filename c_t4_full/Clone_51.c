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
    int num1 = 1, num2 = 2, num3 = 3;
    struct ll_node *head = NULL;
    head = ll_unshift(&head, &num1);
    head = ll_unshift(&head, &num2);
    head = ll_unshift(&head, &num3);
    int val1, val2, val3;
    ll_get_value(head, 0, &val1);
    printf ("%i\n", val1);
    ll_get_value(head, 1, &val2);
    printf ("%i\n", val2);
    ll_get_value(head, 2, &val3);
    printf ("%i\n", val3);
    return 0;
}


