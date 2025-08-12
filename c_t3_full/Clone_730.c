main () {
    struct books {
        char name [100], author [100];
        int year, copies;
    } book1, book2;
    printf ("Enter details of first book\n");
    gets (book1.name);
    gets (book1.author);
    char buff [100];
    gets (buff);
    book1.year = atoi (buff);
    gets (buff);
    book1.copies = atoi (buff);
    printf ("Enter details for second book\n");
    gets (book2.name);
    gets (book2.author);
    gets (buff);
    book2.year = atoi (buff);
    gets (buff);
    book2.copies = atoi (buff);
    printf ("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
    printf ("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
}



main () {
    struct books {
        char name [100], author [100];
        int year, copies;
    } book1, book2;
    printf ("Enter details of first book\n");
    fgets (book1.name, 100, stdin);
    fgets (book1.author, 100, stdin);
    char buff [100];
    fgets (buff, 100, stdin);
    book1.year = atoi (buff);
    fgets (buff, 100, stdin);
    book1.copies = atoi (buff);
    printf ("Enter details for second book\n");
    fgets (book2.name, 100, stdin);
    fgets (book2.author, 100, stdin);
    fgets (buff, 100, stdin);
    book2.year = atoi (buff);
    fgets (buff, 100, stdin);
    book2.copies = atoi (buff);
    printf ("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
    printf ("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
}


