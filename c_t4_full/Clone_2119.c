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
  static char str2[30];
  char *str = (char*)calloc(30, sizeof(char));
  printf("Enter a sentence:");
  scanf("%s", str);
  check(str);
  snprintf(str2, sizeof(str2), "%s", str); 
  getchar();
}


