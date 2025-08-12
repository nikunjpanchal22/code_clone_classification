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






#include<stdio.h>
#include<stdlib.h>
#include<string.h>
int main() {
  char *name = "krishna";
  char *copy = (char *) malloc(strlen(name)+1);
  char *temp = copy;
  while(*copy++ = *name++);
  printf("%s", temp);
  free(temp);
  return 0;
}


