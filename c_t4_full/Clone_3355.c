int main () {
    char *p = "krishna";
    int size = strlen (p) + 1;
    char *q = (char *) malloc (size);
    char *qi = q;
    do {
        *q++ = *p;
    }
    while (*p++ != '\0');
    q = qi;
    printf ("%s", q);
    getch ();
    return 0;
}






#include <stdio.h>
#include <string.h>
#include <stdlib.h>
int main() {
  char name[]="krishna";
  char *copy = malloc((strlen(name) + 1)*sizeof(char));
  char *sptr = name, *dptr = copy;
  while(*dptr++ = *sptr++);
  printf("%s", copy);
  free(copy);
  return 0;
}


