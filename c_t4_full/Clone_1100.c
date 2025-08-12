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




#define _GNU_SOURCE
#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <ctype.h>

int main(void) {
	  char *str;
	  asprintf(&str, "%100s","");
	  fgets (str, 100, stdin);
	  str = strtok (str, " \n\t\r");
	  while (str != NULL) {
	      *str = toupper(*str);
	      int i;
	      for(i = strlen(str)-1; i >= 0; i--)
		  putchar(str[i]);
	      printf (" ");
	      str = strtok (NULL, " \n\r\t");
	  }
	  printf ("\n");
	  free(str);
	  return 0;
}


