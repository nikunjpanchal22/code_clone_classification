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

#define DELIMS " ,.-"
#define STRING "- This, a sample string."

int main(void)
{
    char str[] = STRING;
    for(char *token = strtok(str, DELIMS); token != NULL; token = strtok(NULL, DELIMS))
        printf("%s\n", token);
    return 0;
}


