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
    struct node *node;
    node = malloc (sizeof (struct node));
    for (i = 0; i < 5; i++) { 
        int newData = i;
        node->data = newData;
        node->link = first;
        first = node;
        node = malloc (sizeof (struct node));
    }
    dumpNodes ();
    reverse ();
    dumpNodes ();
    printf ("==========\n");
    return 0;
}
