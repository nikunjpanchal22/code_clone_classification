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
    int i = 0;
    struct node *newnode; 
    for (i = 0; i < 5; i++) {
        newnode = malloc (sizeof (struct node));
        newnode->data = i;
        newnode->link = NULL;
        if (first == NULL) 
            first = newnode;
        else
            insert_node(newnode);
    }
    dumpNodes ();
    reverse_list(first);
    dumpNodes ();
    printf ("==========\n");
    return 0;
}


