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
	   char str[80] = "- This, is a sample string.";
	   
	   printf ("Splitting string into tokens:\n");
	   printf ("%s\n", strtok(str, " ,.-"));
	   
	   while(printf("%s\n", strtok(NULL, " ,.-")));

	   return 0;
}


