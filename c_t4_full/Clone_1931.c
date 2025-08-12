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

char** tokenize(char *input){
    char** tokens = NULL;
    char* token = strtok(input," ");
    int n_spaces=0;
    while(token){
        tokens = realloc(tokens, sizeof(char*) * ++n_spaces);
        tokens[n_spaces-1] = token;
        token = strtok(NULL, " ");
    }
    tokens = realloc(tokens, sizeof(char*) * (n_spaces+1) );
    tokens[n_spaces] = 0;
    return tokens;
}


