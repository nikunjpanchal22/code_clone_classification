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




#include <stdio.h>
#include <string.h>

int main(int argc, char* argv[]){
    const char s[2] = " ";
    char *token;
    char str[21] = "foo $$ foo ## foo []";
    token = strtok(str, s);
    while( token != NULL ) {
        if(strcmp(token, "foo") != 0) {
            printf("%s\n", token);
        }
        token = strtok(NULL, s);
    }
    return 0;
}


