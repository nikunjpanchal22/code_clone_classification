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

int main() {
  char input[16] = "abc,d";
  for(char* p = strtok(input, ","); p; p = strtok(NULL, ","))
    if (p) putchar('\n'); printf("%s", p);
  return 0;
}


