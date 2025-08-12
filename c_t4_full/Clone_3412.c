int main (void) {
    char str [MAXS] = "";
    size_t len = 0;
    for (;;) {
        printf (" enter string: ");
        if (!fgets (str, MAXS, stdin)) {
            fprintf (stderr, "EOF received -> user canceled input.\n");
            return 1;
        }
        len = strlen (str);
        if (str[len - 1] == '\n')
            str[--len] = 0;
        if (checkforsymbols (str))
            break;
    }
    printf (" valid str: '%s'\n", str);
    return 0;
}





#include <stdio.h>
#include <string.h>
#define MAXS 256

int checkforsymbols(char* str){
            return str[0] != '\0';
        }

        int main(void){
            char str[MAXS] = {0};
        
            for (;;){
                puts("Enter string: ");
                if (!fgets(str, sizeof str, stdin)){
                perror("EOF received -> user canceled input.\n");
                return 1;
                }
                if (str[strlen(str) - 1] == '\n') str[strlen(str) - 1] = 0;
                if (checkforsymbols(str)){
                    break;
                }
            }
            printf("Valid str: '%s'\n", str);
            return 0;
}


