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

int main(int argc, char * argv[]) {
    char str[] = "foo $$ foo ## foo []";
    char * p;
    for (p = strtok(str, " "); p; p = strtok(NULL, " "))
        if (*p != * "foo")
            puts(p);
    return 0;
}


