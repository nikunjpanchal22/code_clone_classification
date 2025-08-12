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
    struct node *current = NULL;
    for (int i = 4; i >= 0; --i) {
        struct node *newnode = malloc (sizeof (struct node)); 
        newnode->data = i;
        newnode->link = current;
        current = newnode;
    }
    first = current; 
    dumpNodes ();
    reverse ();
    dumpNodes ();
    printf ("==========\n");
    return 0;
}


