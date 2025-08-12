int main () {
    struct books {
        char name [100], author [100];
        int year, copies;
    } book1, book2;
    char c;
    printf ("Enter details of first book\n");
    gets (book1.name);
    gets (book1.author);
    scanf ("%d%d", & book1.year, & book1.copies);
    while ((c = getchar ()) != '\n' && c != EOF)
        ;
    printf ("Enter details for second book\n");
    gets (book2.name);
    gets (book2.author);
    scanf ("%d%d", & book2.year, & book2.copies);
    while ((c = getchar ()) != '\n' && c != EOF)
        ;
    printf ("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
    printf ("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
    return 0;
}


 
int main () {
    struct books {
        char name [100], author [100];
        int year, copies;
    } book1, book2;
   
    char c; 
    printf ("Enter details of first book\n");
    fgets(book1.name, 101, stdin);
    book1.name[strcspn(book1.name, "\n")] = 0;
    fgets(book1.author, 101, stdin);
    book1.author[strcspn(book1.author, "\n")] = 0;
    scanf ("%d%d", & book1.year, & book1.copies);
    while ((c = getchar ()) != '\n' && c != EOF)
        ;
    printf ("Enter details for second book\n");
    fgets(book2.name, 101, stdin);
    book2.name[strcspn(book2.name, "\n")] = 0;
    fgets(book2.author, 101, stdin);
    book2.author[strcspn(book2.author, "\n")] = 0;
    scanf ("%d%d", & book2.year, & book2.copies);
    while ((c = getchar ()) != '\n' && c != EOF)
        ;
    printf ("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
    printf ("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
    return 0;
}


