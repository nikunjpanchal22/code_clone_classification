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
typedef struct book{
	    char name[100], author[100];
	    int year, copies;
	}Book;
	Book get_book_details(){
	    Book book;
	    fgets(book.name, sizeof(book.name), stdin);
	    fgets(book.author, sizeof(book.author), stdin);
	    scanf("%d%d", &book.year, &book.copies);
	    return book;
	}
	void print_book(Book book){
	    printf("%s%s%d\n%d\n", book.name, book.author, book.year, book.copies);
	}
	int main(void) {
	    printf("Enter details of first book\n");
	    Book book = get_book_details();
	    print_book(book);
	    printf("Enter details for second book\n");
	    Book book2 = get_book_details();
	    print_book(book2);
	    return 0;
}


