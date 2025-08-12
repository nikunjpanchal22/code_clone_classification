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
#include <stdlib.h>

struct books {
	    char *name, *author;
	    int year, copies;
	};

	int main() {
	    struct books book1, book2;
	    char line[256];

	    book1.name = malloc(sizeof(char) * 100);
	    book1.author = malloc(sizeof(char) * 100);
	    book2.name = malloc(sizeof(char) * 100);
	    book2.author = malloc(sizeof(char) * 100);

	    printf("Enter details of first book\n");
	    fgets(book1.name, 100, stdin);
	    fgets(book1.author, 100, stdin);
	    fgets(line, sizeof(line), stdin);
	    sscanf(line, "%d%d", &book1.year, &book1.copies);

	    printf("Enter details for second book\n");
	    fgets(book2.name, 100, stdin);
	    fgets(book2.author, 100, stdin);
	    fgets(line, sizeof(line), stdin);
	    sscanf(line, "%d%d", &book2.year, &book2.copies);

	    printf("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
	    printf("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);

	    free(book1.name);
	    free(book1.author);
	    free(book2.name);
	    free(book2.author);

	    return 0;
}


