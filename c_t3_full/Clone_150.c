int main () {
    struct node *head = NULL;
    FILE *file = fopen ("duom.txt", "r");
    int i = 0;
    fscanf (file, "%d", & i);
    while (!feof (file)) {
        push (& head, i);
        fscanf (file, "%d", & i);
    }
    fclose (file);
    puts ("Created Linked List: ");
    printList (head);
    min (& head);
    puts ("\nLinked List after Deletion of minimum: ");
    printList (head);
    return 0;
}


 int main (void) {
    struct node *head = NULL;
    FILE *fp = fopen ("duom.txt", "r");
    int n = 0;
    while (fscanf (fp, "%d", & n) != EOF) {
        head = insert_at_start (head, n);
    }
    fclose (fp);
    puts ("Created Linked List: ");
    traverseList (head);
    deleteMin (head);
    puts ("\nLinked List after Deletion of minimum: ");
    traverseList (head);
    return 0;
}


