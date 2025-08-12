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




#include <stdio.h>

typedef struct {
		    char name[100];
		    char author[100];
		    int year;
		    int copies;
		} book;

		void inputBook(book* b) {
		    char line[256];

		    fgets(b->name, sizeof(b->name), stdin);
		    fgets(b->author, sizeof(b->author), stdin);
		    fgets(line, sizeof(line), stdin);
		    sscanf(line, "%d%d", &b->year, &b->copies);
		}

		void outputBook(const book* b) {
		    printf("%s\n%s\n%d\n%d\n", b->name, b->author, b->year, b->copies);
		}

		int main() {
		    book book1, book2;

		    printf("Enter details of first book\n");
		    inputBook(&book1);
		    printf("Enter details for second book\n");
		    inputBook(&book2);

		    printf("First book details:\n");
		    outputBook(&book1);
		    printf("Second book details:\n");
		    outputBook(&book2);

		    return 0;
}


