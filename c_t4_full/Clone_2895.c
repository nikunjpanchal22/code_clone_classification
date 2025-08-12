int main () {
    char input [16] = "abc,d";
    char *p;
    p = strtok (input, ",");
    if (p) {
        printf ("%s\n", p);
    }
    p = strtok (NULL, ",");
    if (p)
        printf ("%s\n", p);
    return 0;
}





#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int main() {
  char *input = strdup("abc,d");
  char *p = NULL;
  p = strsep(&input, ",");
  printf ("%s\n", p);
  printf ("%s\n", input);
  free(input);
  return 0;
}


