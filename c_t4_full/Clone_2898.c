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





#include <string.h>
#include <stdio.h>

int main() {
  char input[16] = "abc,d";
  char* p = strtok(input, ",");
  do { printf("%s\n", p); } while ((p = strtok(NULL, ",")) != NULL);
  return 0;
}


