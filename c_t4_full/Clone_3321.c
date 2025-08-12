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
    char *p, str[] = "foo $$ foo ## foo []", *delim = " ";
    for (p = strtok(str, delim); p; p = strtok(NULL, delim))
        if (strcmp(p, "foo"))
            printf("%s\n", p);
    return 0;
}


