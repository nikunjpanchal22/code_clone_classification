int main (void) {
    int i;
    struct node *newnode;
    for (i = 0; i < 5; i++) {
        newnode = malloc (sizeof (struct node));
        newnode->data = i;
        newnode->link = first;
        first = newnode;
    }
    dumpNodes ();
    reverse ();
    dumpNodes ();
    printf ("==========\n");
    return 0;
}


 int main (void) {
    int i;
    struct node *newnode;
    for (i = 4; i >= 0; --i) {
        newnode = malloc (sizeof (struct node));
        newnode->data = i;
        newnode->link = NULL;
        if (first == NULL) {
            first = newnode;
        } else {
            struct node *tmp = first;
            while (tmp->link != NULL) {
                tmp = tmp->link;
            }
            tmp->link = newnode;
        }
    }
    dumpNodes ();
    reverse ();
    dumpNodes ();
    printf ("==========\n");
    return 0;
}


