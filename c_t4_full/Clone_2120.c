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

extern void check(char*);

void main(void) {
  static char str2[30];
  char *str = (char*)malloc(30);
  printf("Enter a sentence:");
  fscanf(stdin, "%s", str);
  check(str);
  strncpy(str2, str, 30);
  getchar();
}


