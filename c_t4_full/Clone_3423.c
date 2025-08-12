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

#define DELIMITERS " ,.-"
#define TEXT "- This, a sample string."

int main () {
    char str [] = TEXT;
    for(char *pch = strtok (str, DELIMITERS); pch != NULL; pch = strtok (NULL, DELIMITERS)) {
        printf ("%s\n",pch);
    }
    return 0;
}


