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
#include<stdlib.h>
typedef struct {
	    char name[100];
	    char author[100];
	    int year;
	    int copies;
	} Book;

	Book getBookDetails(void) {
	    Book book;
	    fgets(book.name, sizeof(book.name), stdin);
	    fgets(book.author, sizeof(book.author), stdin);
	    scanf("%d", &book.year);
	    scanf("%d", &book.copies); 
	    return book;
	}

	void printBookDetails(Book book) {
	    printf("%s%s%d\n%d\n", book.name, book.author, book.year, book.copies);
	}

	int main(void) {
	    Book book1, book2;
	    printf("Enter details of first book\n");
	    book1 = getBookDetails();
	    printf("Enter details for second book\n");
	    book2 = getBookDetails();
	    printBookDetails(book1);
	    printBookDetails(book2);
	    return 0;
}


