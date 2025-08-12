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
    d_t *root, *head, *prev;
    scanf ("%d", & x);
    root = head = prev = NULL;
    while (x == 1) {
        root = (d_t *) malloc (sizeof (d_t));
        root->x = 1;
        if (head == NULL)
            head = root;
        else
            prev->next = root;
        prev = root;
        scanf ("%d", & x);
    }
    root = head;
    while (root) {
        printf ("%d\n", root -> x);
        root = root->next;
    }
}


