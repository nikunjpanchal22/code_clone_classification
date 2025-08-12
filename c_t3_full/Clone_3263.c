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
    p = strstr (str, "foo");
    while (p != NULL) {
        printf ("%s\n", p);
        p = strstr (p + 3, "foo");
    }
    return 0;
}


