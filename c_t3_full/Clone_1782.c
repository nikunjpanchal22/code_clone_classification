int main () {
    int x;
    d_t *root, *head;
    scanf ("%d", & x);
    head = NULL;
    while (x == 1) {
        root = (d_t *) malloc (sizeof (d_t));
        root->x = 1;
        root->next = head;
        head = root;
        scanf ("%d", & x);
    }
    root = head;
    while (root) {
        printf ("%d\n", root -> x);
        root = root->next;
    }
}


 int main () {
    int x;
    d_t *root, *head, *ptr;
    root = head = ptr = NULL;
    while (scanf ("%d", & x) != EOF) {
        if (x != 1)
            break;
        ptr = (d_t *) malloc (sizeof (d_t));
        ptr->x = 1;
        if (head == NULL)
            head = ptr;
        else
            root->next = ptr;
        root = ptr;
    }
    ptr = head;
    while (ptr) {
        printf ("%d\n", ptr -> x);
        ptr = ptr->next;
    }
}


