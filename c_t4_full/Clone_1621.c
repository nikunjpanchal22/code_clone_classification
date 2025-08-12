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




int main () {
    struct node* root = NULL;
    for(int i = 1; i <= 5; i++) {
        root = insert(root, i);
    }
    dumpNodes(root);
    root = reverseNode(root);
    dumpNodes(root);
    printf("==========\n");
    return 0;
}


