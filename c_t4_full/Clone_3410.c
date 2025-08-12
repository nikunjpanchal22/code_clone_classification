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

int checkforsymbols(const char* str){
            return str[0] != '\0';
        }

        int main(void){
            char str[MAXS] = {0};
        
            while(1){
                printf("Enter string: ");
                if (!fgets(str, MAXS, stdin)){
                    fprintf(stderr, "EOF received -> user canceled input.\n");
                    return 1;
                }
                size_t len = strlen(str);
                if(len > 0 && str[len - 1] == '\n'){
                    str[(len--) - 1] = 0;
                }
                if(checkforsymbols(str)){
                    break;
                }
            }
            printf("Valid str: '%s'.\n", str);
            return 0;
}


