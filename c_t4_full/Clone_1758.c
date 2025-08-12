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
#define S 100
typedef struct{
	    char n[S], a[S];
	    int y, c;
	} B;
	int main(){
	    B b1, b2;
	    char buff[S];
	    printf ("Enter details of first book\n");
	    fgets(b1.n, sizeof(b1.n), stdin);
	    fgets(b1.a, sizeof(b1.a), stdin);
	    fgets(buff, sizeof(buff), stdin);
	    sscanf(buff, "%d", &b1.y);
	    fgets(buff, sizeof(buff), stdin);
	    sscanf(buff, "%d", &b1.c);
	    printf ("Enter details for second book\n");
	    fgets(b2.n, sizeof(b2.n), stdin);
	    fgets(b2.a, sizeof(b2.a), stdin);
	    fgets(buff, sizeof(buff), stdin);
	    sscanf(buff, "%d", &b2.y);
	    fgets(buff, sizeof(buff), stdin);
	    sscanf(buff, "%d", &b2.c);
	    printf ("%s\n%s\n%d\n%d\n", b1.n, b1.a, b1.y, b1.c);
	    printf ("%s\n%s\n%d\n%d\n", b2.n, b2.a, b2.y, b2.c);
	    return 0;
	}

  

#include <stdio.h>
#define SIZE 100
typedef struct{
	    char NAME[SIZE], AUTHOR[SIZE];
	    int YEAR, COPIES;
	} Books;
	void input(Books *bk){
	    char buffer[SIZE];
	    fgets(bk->NAME, sizeof(bk->NAME), stdin);
	    fgets(bk->AUTHOR, sizeof(bk->AUTHOR), stdin);
	    fgets(buffer, sizeof(buffer), stdin);
	    sscanf(buffer, "%d", &bk->YEAR);
	    fgets(buffer, sizeof(buffer), stdin);
	    sscanf(buffer, "%d", &bk->COPIES);
	}
	void output(Books *bk){
	    printf("%s\n%s\n%d\n%d\n", bk->NAME, bk->AUTHOR, bk->YEAR, bk->COPIES);
	}
	int main(){
	    Books b1, b2;
	    printf("Enter details of first book\n");
	    input(&b1);
	    printf("Enter details for second book\n");
	    input(&b2);
	    output(&b1);
	    output(&b2);
	    return 0;
}


