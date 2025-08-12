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




#include <stdio.h>
#include <string.h>

int main(void) {
    char str[] = "This is abc test abc string";
    char *slice = strtok(str, "abc");

    while(slice != NULL) {
        printf("%s\n", slice);
        slice = strtok(NULL, "abc");
    }

    return 0;
}


