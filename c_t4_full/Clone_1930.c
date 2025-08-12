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

char** tokenize(char *str){
    char **tokens = malloc(1024*sizeof(char *));
    char *token;
    int index = 0;

    token = strtok(str, " ");
    while(token != NULL){
        tokens[index] = strdup(token);
        index++;
        token = strtok(NULL, " ");
    }
    tokens[index] = NULL;
    return tokens;
}


