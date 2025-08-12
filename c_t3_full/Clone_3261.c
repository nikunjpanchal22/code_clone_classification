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

int main(int argc, char *argv[]) {
    char str[] = "foo $$ foo ## foo []";
    char *token = strtok(str, " ");
    while(token) {
        if(strcmp(token, "foo"))
            printf("%s\n", token);
        token = strtok(NULL, " ");
    }
    return 0;
}


