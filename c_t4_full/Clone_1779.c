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
#define SIZE 100

struct book {
	    char name[SIZE];
	    char author[SIZE];
	    int year, copies;
	};

	void input_book(struct book *b) {
	    fgets(b->name, SIZE, stdin);
	    fgets(b->author, SIZE, stdin);
	    scanf("%d %d", &(b->year), &(b->copies));
	    getchar();
	}

	void output_book(struct book *b) {
	    printf("%s%s%d\n%d\n", b->name, b->author, b->year, b->copies);
	}

	int main() {
	    struct book book1, book2;

	    printf("Enter details of first book\n");
	    input_book(&book1);
	    printf("Enter details for second book\n");
	    input_book(&book2);
	    output_book(&book1);
	    output_book(&book2);

	    return 0;
}


