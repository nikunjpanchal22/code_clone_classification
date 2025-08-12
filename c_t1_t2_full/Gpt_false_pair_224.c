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
    int num = 0;
    fscanf (fp, "%d", & num);
    while (!feof (fp)) {
        insertLast (& head, num);
        fscanf (fp, "%d", & num);
    }
    fclose (fp);
    puts ("Created Linked List: ");
    displayList (head);
    deleteSmall (head);
    puts ("\nLinked List after Deletion of minimum: ");
    displayList (head);
    return 0;
}
