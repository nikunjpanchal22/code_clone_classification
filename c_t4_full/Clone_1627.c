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
    int *nums = malloc(5*sizeof(int));
    for(int i = 0; i < 5; i++){
        nums[i] = i;
    }
    printf ("==========\n");
    free(nums);
    return 0;
}


