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

char **tokenize(char *str) {
    int len = strlen(str) + 1;
    char **result = malloc(len * sizeof(char *));
    int n = 0, i;
    for (i = 0; i < len; ++i) 
    {
        if (isspace(str[i]) || str[i] == '\0') str[i] = '\0';
        else if (i == 0 || str[i-1] == '\0') result[n++] = str + i;
    }
    return result;
}


