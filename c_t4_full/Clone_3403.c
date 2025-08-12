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
        return str[0] != 0;
        }

        int main(){
        char str[MAXS] = "";
        
        while(1){
            printf("Enter string: ");
            if(fgets(str, sizeof str, stdin) == NULL){
                fprintf(stderr, "EOF received -> user cancelled input.\n");
                return 1;
            }
            str[strcspn(str, "\n")] = '\0';
            if(checkforsymbols(str)){
                break;
            }
        }
        printf("Valid str: '%s'\n", str);
        return 0;
}


