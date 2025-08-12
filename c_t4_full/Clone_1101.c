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
	    char buffer[100], *word;
	    fgets(buffer, sizeof buffer, stdin);
	    word = strtok(buffer, " \n\t\r\0");
	    while (word) {
		char *character;
		*word = toupper(*word);
		for (character = &word[strlen(word) - 1]; character >= word; character--) {
		    putchar(*character);
		}
		word = strtok(NULL, " \n\t\r\0");
		if (word) {
		    putchar(' ');
		}
	    }
	    putchar('\n');
	    return 0;
}


