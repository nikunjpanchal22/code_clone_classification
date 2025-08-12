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

char** tokenize(char *str) {
    char *token;
    char **tokens = malloc(50 * sizeof(char *));
    int i = 0;
    token = strtok(str, " ");
    while (token) {
        tokens[i] = malloc((strlen(token) + 1) * sizeof(char *));
        strcpy(tokens[i], token);
        i++;
        token = strtok(NULL, " ");
    }
    return tokens;
}


