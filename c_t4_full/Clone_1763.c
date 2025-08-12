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
#include<stdlib.h>
void main() {
	  struct books {
		char name[100], author[100];
		int year, copies;
	    } book[2];
	  int i;
	  for(i = 0; i < 2; i++) {
	    printf("Enter details for book %d\n", i+1);
	    gets(book[i].name);
	    gets(book[i].author);
	    scanf("%d", &book[i].year);
	    scanf("%d", &book[i].copies);
	    getchar();
	  }
	  for(i = 0; i < 2; i++) {
	    printf("%s\n%s\n%d\n%d\n", book[i].name, book[i].author, book[i].year, book[i].copies);
	  }
}


