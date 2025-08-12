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
#include <stdlib.h>
#include <string.h>
int main()
{
  char str[]="krishna";
  int n = strlen(str);
  char *copy = (char *)malloc(n+1);
  memcpy(copy, str, n+1 );
  printf("%s\n", copy);
  free(copy);
  return 0;
}


