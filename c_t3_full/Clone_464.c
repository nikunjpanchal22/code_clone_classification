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

int main()
{
    char str[] = "- This, a sample string.";
    char seps[] = {' ',',','-'};
    char *pch; 
    printf("Splitting string \"%s\" into tokens:\n", str);
    pch = strtok(str, seps);
    while (pch != NULL)
    {
        printf("%s\n", pch);
        pch = strtok(NULL, seps);
    }
    return 0;
}


