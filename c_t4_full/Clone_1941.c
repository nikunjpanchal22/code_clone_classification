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
  char str[] = "John Doe";
  char * split_str;
  split_str = strtok (str, " ");
  char * firstName = split_str;
  split_str = strtok (NULL, " ");
  char * lastName = (split_str != NULL) ? split_str : "";
  printf ("%s, %s\n", lastName, firstName);
  return 0;
}


