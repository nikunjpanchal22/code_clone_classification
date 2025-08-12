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
    printf ("Input First book's name: ");
    gets (book1.name);
    printf ("Input Author name: ");
    gets (book1.author);
    printf ("Input Publication year: ");
    scanf("%d",&book1.year);
    printf ("Input Number of copies: ");
    scanf("%d",&book1.copies);
    printf ("Input Second book's name: ");
    gets (book2.name);
    printf ("Input Author name: ");
    gets (book2.author);
    printf ("Input Publication year: ");
    scanf("%d",&book2.year);
    printf ("Input Number of copies: ");
    scanf("%d",&book2.copies);
    printf ("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
    printf ("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
}


