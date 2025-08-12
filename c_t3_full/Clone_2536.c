int main () {
    char str [] = "test string.";
    char *firstname = strtok (str, " ");
    char *lastname = strtok (NULL, " ");
    if (!lastname)
        lastname = "";
    printf ("%s, %s\n", lastname, firstname);
    return 0;
}





#include <stdio.h>
#include <string.h>

int main () {
  char str[] = "Bruce Wayne";
  char *first, *last;

  first = strtok(str, " ");
  last = strtok(NULL, " ");
  
  if(!last)
    last = "";
    
  printf("%s, %s\n", last, first);
  return 0;
}


