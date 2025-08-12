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

char** tokenize(char *s) {
    char** words = malloc(100 * sizeof(char*));
    char* word = strtok(s, " ");
    int i = 0;
    while (word != NULL) {
        words[i++] = strdup(word);
        word = strtok(NULL, " ");
    }
    return words;
}


