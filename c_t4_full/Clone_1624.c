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
    struct node* list = NULL;
    for(int i = 4; i >= 0; --i)  
        push(&list, i);         
    reverse(&list);              
    printf("==========\n");
    return 0;
}


