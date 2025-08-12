int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    char *p;
    p = strtok (str, " ");
    while (p != NULL) {
        if (strcmp (p, s))
            printf ("%s\n", p);
        p = strtok (NULL, " ");
    }
    return 0;
}




#include <string.h>
#include <stdio.h>

int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char seps[]   = " ";
    char *token;
    token = strtok( str, seps );
    while( token != NULL ) {
        if (strcmp (token, "foo"))
            printf("%s\n", token);
        token = strtok( NULL, seps );
    }
    return 0;
} 


