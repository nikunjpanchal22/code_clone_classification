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
    fscanf (fp, "%d", & n);
    while (!feof (fp)) {
        addNode (& head, n);
        fscanf (fp, "%d", & n);
    }
    fclose (fp);
    puts ("Created Linked List: ");
    listDisplay (head);
    deleteMinimum (& head);
    puts ("\nLinked List after Deletion of minimum: ");
    listDisplay (head);
    return 0;
}
