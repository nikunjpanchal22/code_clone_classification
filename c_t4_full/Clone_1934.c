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
    int number_of_words = 1, index = 0;
    char** tokens = malloc(sizeof(char*));
    char* token = strtok(str, " ");
    while (token != NULL) {
        tokens[index++] = strdup(token);
        token = strtok(NULL, " ");
        tokens = realloc(tokens, (++number_of_words) * sizeof(char*));
    }        
    return tokens;
}


