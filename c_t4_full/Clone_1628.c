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
    struct node *newnode;
    for(int i = 0; i < 5; i++) {
        newnode = enqueue(newnode, i);
    }
    printQueue(newnode);
    printf("==========\n");
    return 0;
}


