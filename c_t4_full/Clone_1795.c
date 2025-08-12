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
	    char name [100];
	    char author [100];
	    int year, copies;
	};

	int main() {
	    struct books book[2];
	    char line[256];
	    
	    for (int i = 0; i < 2; i++) {
		printf("Enter details for book %d\n", (i+1));
		fgets(book[i].name, sizeof(book[i].name), stdin);
		fgets(book[i].author, sizeof(book[i].author), stdin);
		fgets(line, sizeof(line), stdin);
		sscanf(line, "%d%d", &book[i].year, &book[i].copies);
	    }
	    
	    for (int i = 0; i < 2; i++) {
		printf("%s\n%s\n%d\n%d\n", book[i].name, book[i].author, book[i].year, book[i].copies);
	    }

	    return 0;
}


