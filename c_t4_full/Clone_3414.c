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
#define MAXS 256

inline int checkforsymbols(char *str){
        return *str > 0;
        }

        int main(){
        char str[MAXS];
        int len;
        
        do{
            printf("Enter string: ");
            fgets(str, MAXS, stdin);
            if(feof(stdin)){
            printf("EOF received - user cancelled input.\n");
            return 1;
            }
            str[strcspn(str, "\n")] = 0;
        }while(!checkforsymbols(str));
        
        printf("Valid string: '%s'\n", str);
        return 0;
}


