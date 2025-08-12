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

char **tokenize (char *str) {
    char *word;
    size_t words_count = 0;
    char **words = NULL;
    for (word = strtok (str, " "); word; word = strtok (NULL, " ")) {
        words = realloc (words, ++words_count * sizeof *words);
        words[words_count - 1] = strdup (word);
    }
    return words;
}


