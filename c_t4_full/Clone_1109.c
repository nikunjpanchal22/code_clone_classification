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

int main() {
	    char str[100], *p;
	    fgets(str, sizeof str, stdin);
	    for (p = strtok(str, " \n\r\t"); p; p = strtok(NULL, " \n\r\t")) {
		*p = toupper(*p);
		for (size_t i = strlen(p); i--; )
		    putchar(p[i]);
		putchar(' ');
	    }
	    putchar('\n');
	    return 0;
}


