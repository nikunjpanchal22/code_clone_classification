int main (void) {
    char string [100];
    char *tptr;
    size_t i, len;
    printf ("\nEnter string: ");
    if (fgets (string, sizeof (string), stdin) == NULL)
        return 1;
    tptr = strtok (string, " \n\r\t");
    while (tptr != NULL) {
        tptr[0] = toupper (tptr[0]);
        len = strlen (tptr);
        for (i = 0; i < len; i++)
            printf ("%c", tptr[len - 1 - i]);
        tptr = strtok (NULL, " \n\r\t");
        if (tptr != NULL)
            printf (" ");
    }
    printf ("\n");
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

void revPrint (char* s) {
	  s[0] = toupper (s[0]);
	  for (int i = strlen(s) - 1; i >= 0; i--)
	    putchar(s[i]);
	}

	int main (void) {
	  char string [100];
	  fgets(string, sizeof(string), stdin);
	  char* token = strtok (string, " \n\t\r");
	  while (token != NULL) {
	    revPrint(token);
	    printf (" ");
	    token = strtok (NULL, " \n\t\r");
	  }
	  printf ("\n");
	  return 0;
}


