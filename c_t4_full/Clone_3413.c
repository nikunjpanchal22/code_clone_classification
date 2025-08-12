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





#include <string.h>
#include <stdio.h>
#define MAXS 256

static int checkforsymbols(const char *str){
            return str[0] != 0;
        }

        int main(){
            char str[MAXS] = {'\0'};
            int len;
            
            while(1){
                printf("Enter string: ");
                if(fgets(str, MAXS, stdin) == NULL){
                    puts("EOF received - user cancelled input.");
                    return 1;
                }
                str[strlen(str) - 1] = '\0';
                if(checkforsymbols(str)){
                    break;
                }
            }
            printf("Valid string: '%s'\n", str);
            return 0;
}


