int main () {
    char str [] = "- This, a sample string.";
    char *pch;
    printf ("Splitting string \"%s\" into tokens:\n", str);
    pch = strtok (str, " ,.-");
    while (pch != NULL) {
        printf ("%s\n", pch);
        pch = strtok (NULL, " ,.-");
    }
    return 0;
}





#include <stdio.h>
#include <string.h>

int main () 
{
	   const char delimiters[] = " ,.-";
	   char str[] = "Here, we go again.";
	   char *token;

	   token = strtok(str, delimiters);

	   while (token != NULL)
	   {
	      printf ("%s\n", token);
	      token = strtok(NULL, delimiters);
	   }

	   return 0;
}


