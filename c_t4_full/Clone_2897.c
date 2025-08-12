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
  char* p = strtok(input, ",");
  p ? printf("%s\n", p) : 0;
  p = strtok(NULL, ",");
  p ? printf("%s\n", p) : 0;
  return 0;
}


