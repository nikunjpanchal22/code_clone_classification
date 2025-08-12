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




#include <stdio.h>
#include <stdlib.h>
void fillBook(struct books *book) {
	    char buff[100];
	    gets(book->name);
	    gets(book->author);
	    gets(buff);
	    book->year = atoi(buff);
	    gets(buff);
	    book->copies = atoi(buff);
	}
	void main() {
	    struct books {
	    char name[100], author[100];
	    int year, copies;
	    } book1, book2;

	    printf("Enter details of first book\n");
	    fillBook(&book1);
	    printf("Enter details for second book\n");
	    fillBook(&book2);
	    printf("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
	    printf("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
}


