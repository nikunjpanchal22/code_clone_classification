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

struct books {
	    char name[100];
	    char author[100];
	    int year;
	    int copies;
	};

	void fillBook(struct books* b) {
	    char line[256];

	    fgets(b->name, sizeof(b->name), stdin);
	    fgets(b->author, sizeof(b->author), stdin);
	    fgets(line, sizeof(line), stdin);
	    sscanf(line, "%d%d", &(b->year), &(b->copies));
	}

	int main() {
	    struct books book1, book2;

	    printf("Enter details of first book\n");
	    fillBook(&book1);
	    
	    printf("Enter details for second book\n");
	    fillBook(&book2);

	    printf("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
	    printf("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);
	    
	    return 0;
}


