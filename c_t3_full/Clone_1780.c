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
    d_t *root, *head, *curr;
    root = head = curr = NULL;
    scanf ("%d", & x);
    while (x == 1) {
        curr = (d_t *) malloc (sizeof (d_t));
        curr->x = 1;
        if (head == NULL)
            head = curr;
        else
            root->next = curr;
        root = curr;
        scanf ("%d", & x);
    }
    curr = head;
    while (curr) {
        printf ("%d\n", curr -> x);
        curr = curr->next;
    }
}


