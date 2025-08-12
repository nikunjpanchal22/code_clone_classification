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

void print_token(char *str){
            char *pch = strtok(str, " ,.-");
            while(pch != NULL) {
                printf("%s\n", pch);
                pch = strtok(NULL, " ,.-");
            }
        }

        int main () {
            char str [] = "- This, a sample string.";
            print_token(str);
            return 0;
}


