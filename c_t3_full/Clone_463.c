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
    const char s[] = " ,.-";
    char *token;
    printf("Splitting string \"%s\" into tokens:\n", str);
    token = strtok(str, s);
    while (token != NULL)
    {
        printf("%s\n", token);
        token = strtok(NULL, s);
    }
    return 0;
}


