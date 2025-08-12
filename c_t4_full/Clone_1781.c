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




#include<stdio.h>
typedef struct {
	    char name[100], author[100];
	    int year, copies;
	} Book;

	Book getBook() {
	    Book book;
	    fflush(stdin);
	    fgets(book.name, 100, stdin);
	    fgets(book.author, 100, stdin);
	    scanf("%d %d", &book.year, &book.copies);
	    getchar();
	    return book;
	}

	void printBook(Book book) {
	    printf("%s%s%d\n%d\n", book.name, book.author, book.year, book.copies);
	}

	int main() {
	    printf("Enter details of first book\n");
	    Book book1 = getBook();
	    printf("Enter details for second book\n");
	    Book book2 = getBook();

	    printBook(book1);
	    printBook(book2);

	    return 0;
}


