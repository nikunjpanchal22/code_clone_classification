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
#include <string.h>
#include <ctype.h>

int main(void)
{
	    char string[100], *token;
	    fgets(string, sizeof string, stdin);
	    for (token = strtok(string, " \n\t\r"); token != NULL; token = strtok(NULL, " \n\t\r")) {
		size_t length = strlen(token);
		token[0] = toupper(token[0]);
		for (size_t i = length - 1; ~i; i--)
		    putchar(token[i]);
		printf(" ");
	    }
	    putchar('\n');
	    return 0;
}


