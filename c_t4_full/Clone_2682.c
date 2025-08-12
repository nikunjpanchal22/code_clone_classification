int main (void) {
    char str [] = "This is abc test abc string";
    char *in = str;
    char *delim = "abc";
    char *token;
    do {
        token = strstr (in, delim);
        if (token)
            *token = '\0';
        printf ("%s\n", in);
        in = token + strlen (delim);
    }
    while (token != NULL);
    return 0;
}





#include <string.h>
#include <stdio.h>
int main(void) {
    char str[] = "This is abc test abc string";
    for (char *p = strtok(str,"abc"); p != NULL; p = strtok(NULL, "abc")) {
        printf("%s\n", p);
    }
    return 0;
}


