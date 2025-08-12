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
    i = 0;
    while (i < 5) {
        newnode = malloc (sizeof (struct node));
        newnode->data = i;
        newnode->link = first;
        first = newnode;
        i++;
    }
    dumpNodes ();
    reverse_listIter(first);
    dumpNodes ();
    printf ("==========\n");
    return 0;
}


