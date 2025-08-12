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
void check(char*);

void main(void) {
  char str2[30], *str = malloc(30);
  printf("Enter a sentence:");
  fgets(str, 30, stdin);
  check(str);
  memcpy(str2, str, strlen(str)+1);
  getchar();
}


