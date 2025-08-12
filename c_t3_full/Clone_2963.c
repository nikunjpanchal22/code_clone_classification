int main () {
    char first [20];
    char last [20];
    char full [40];
    printf ("Your first name?: ");
    fgets (first, sizeof (first), stdin);
    printf ("your last name?: ");
    fgets (last, sizeof (last), stdin);
    first[strlen (first) - 1] = '\0';
    strcpy (full, first);
    strcat (full, " ");
    strcat (full, last);
    printf ("Your full name is: %s", full);
}





#include <stdio.h>
#include <string.h>
int main () {
  char first [20];
  char last [20];
  char Fullname [40];
  printf ("Your first name?: ");
  gets(first);
  printf ("Your last name?: ");
  gets(last);
  strcpy (Fullname, first);
  Fullname[strlen(first)] = ' ';
  strcpy (Fullname + strlen(first) + 1, last);
  printf ("Your full name is: %s", Fullname);
}


