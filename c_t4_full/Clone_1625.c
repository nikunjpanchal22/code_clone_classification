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
    size_t size = 5;
    newnode = create_list(size);
    print_list(newnode);
    resize_list(newnode, size+5);
    return 0;
}


