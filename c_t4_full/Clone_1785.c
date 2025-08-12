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

int main() {
	    struct books {
		char name[100], author[100];
		int year, copies;
	    };
	    
	    struct books book1, book2;
	    char line[256];

	    printf("Enter details of first book\n");
	    fgets(book1.name, sizeof(book1.name), stdin);
	    fgets(book1.author, sizeof(book1.author), stdin);
	    fgets(line, sizeof(line), stdin);
	    sscanf(line, "%d %d", &book1.year, &book1.copies);

	    printf("Enter details for second book\n");
	    fgets(book2.name, sizeof(book2.name), stdin);
	    fgets(book2.author, sizeof(book2.author), stdin);
	    fgets(line, sizeof(line), stdin);
	    sscanf(line, "%d %d", &book2.year, &book2.copies);

	    printf("%s\n%s\n%d\n%d\n", book1.name, book1.author, book1.year, book1.copies);
	    printf("%s\n%s\n%d\n%d\n", book2.name, book2.author, book2.year, book2.copies);

	    return 0;
}


