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
struct books {
	    char name[100], author[100];
	    int year, copies;
	};

	int main() {
	    struct books book[2] = {0};
	    for(int i=0; i<2; i++) {
		printf("Enter details of book %d\n", i+1);
		fgets(book[i].name, 100, stdin);
		fgets(book[i].author, 100, stdin);
		fflush(stdin);
		scanf("%d %d", &book[i].year, &book[i].copies);
		getchar();
	    }
	    for(int i=0; i<2; i++)
		printf("%s%s%d\n%d\n", book[i].name, book[i].author, book[i].year, book[i].copies);
	 
	    return 0;
}


