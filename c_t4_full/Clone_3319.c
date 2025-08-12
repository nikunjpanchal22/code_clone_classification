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




#include<string.h>
#include<stdio.h>
#define INPUT "foo $$ foo ## foo []"
#define SEARCH "foo"

int main (int ac, char *argv []) {
    char *token, *end, str[] = INPUT;
    char *search = SEARCH;
    for (token = strtok_r(str, " ", &end); token != NULL;
         token = strtok_r(NULL, " ", &end))
        if (strcmp(token, search))
            printf("%s\n", token);
    return 0;
}


