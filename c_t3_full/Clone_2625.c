void main (void) {
    char str2 [30];
    char *str;
    str = malloc (30);
    printf ("Enter a sentence:");
    gets (str);
    check (str);
    strcpy (str2, str);
    getch ();
}



#include <stdio.h>
#include <stdlib.h>
#include <string.h>

void check(char *str);

void main(void) {
    char str2[30];
    char *str;
    str = (char*)calloc(30, sizeof(char));
    fgets(str, 30, stdin);
    check(str);
    strncpy(str2, str, 30);
    getchar();
}


