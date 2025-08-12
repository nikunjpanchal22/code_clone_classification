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

int main (void) {
	   char *inputs = calloc(100, sizeof(char));
	   fgets(inputs, 100, stdin);
	   char del[] = {' ', '\n', '\r', '\t'};
	   char *token = strtok (inputs, del);
	   while (token != NULL) {
	       size_t len = strlen (token);
	       for (size_t i = 0; i < len; i++)
		   putchar (toupper(token[len - i - 1]));
	       token = strtok (NULL, del);
	       putchar (' ');
	   }
	   putchar ('\n');
	   free(inputs);
	   return 0;
}


