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
    scanf ("%d", & x);
    
    while (x == 1) {
        ptr = (d_t *) malloc (sizeof (d_t));
        ptr->x = 1;
        ptr->next = head;
        head = ptr;
        if (root == NULL)
            root = head;
        scanf ("%d", & x);
    }
    ptr = root;
    while (ptr) {
        printf ("%d\n", ptr -> x);
        ptr = ptr->next;
    }
}
