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




int main() {
    struct node *head = NULL;
    head = insertEnd(head, 5);
    dumpNodes(head);
    head = reverse(head);
    dumpNodes(head);
    printf("==========\n");
    return 0;
}


