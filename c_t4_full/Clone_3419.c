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

#define STRING "- This, a sample string."

        void print_tokens(char* str, const char* delims)
        {
            for(char* token = strtok(str, delims); token != NULL; token = strtok(NULL, delims))
                printf("%s\n", token);
        }

        int main(void)
        {
            char str[] = STRING;
            print_tokens(str, " ,.-");
            return 0;
}


