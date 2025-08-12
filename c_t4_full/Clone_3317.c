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
    char *p = str, *s = "foo";
    do {
        while (*p == ' ') ++p;
        if (!strncmp (p, s, strlen(s))) p += strlen(s);
        else {
            char *e = strchr (p, ' ');
            if (e) *e = '\0';
            printf ("%s\n", p);
            if (e) p = e + 1;
            else break;
        }
    } while (*p);
    return 0;
}


