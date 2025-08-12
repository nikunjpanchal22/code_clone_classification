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
    d_t *root, *head;
    root = head = NULL;
    while (fscanf (stdin,"%d", & x) != EOF) {
        if(x != 1)
            break;
        root = (d_t *) malloc (sizeof (d_t));
        root->x = 1;
        root->next = head;
        head = root;
    }
    root = head;
    while (root) {
        printf ("%d\n", root -> x);
        root = root->next;
    }
}


