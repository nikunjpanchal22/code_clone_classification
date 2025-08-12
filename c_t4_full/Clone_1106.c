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
	    char string [100];
	    char *tptr;
	    gets(string);
	    for(tptr = strtok(string," \n\r\t"); tptr; tptr = strtok(NULL," \n\r\t")) {
		int i, len;
		len = strlen(tptr);
		for(i = len-1; i >= 0; i--)
		    putchar(toupper(tptr[i]));
		printf(" ");
	    }
	    printf("\n");
	    return 0;
}


