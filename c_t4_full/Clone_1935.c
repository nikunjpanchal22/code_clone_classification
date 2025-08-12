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

char** tokenize(char *s){
    char* word = strtok(s, " ");
    static char* words[10];
    int i = 0;
    while (word != NULL) {
        words[i++] = word;
        word = strtok(NULL, " ");
    }
    return words;
}


