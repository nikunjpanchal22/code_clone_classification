int main () {
    char **tokens = tokenize ("test string.");
    char **it;
    for (it = tokens; it && *it; ++it) {
        printf ("%s\n", * it);
        free (*it);
    }
    free (tokens);
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

char ** tokenize(char * str) {
    int count = 0;
    char** tokens = malloc(500 * sizeof(char *));
    char * p = strtok (str, " ");
    while (p != NULL)
    {
        tokens[count] = p;
        count++;
        p = strtok (NULL, " ");
    }
    return tokens;
}


