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

char** tokenize(char* str)
{
    int count = 0;
    char* tmp = str, *last;
    char** result = (char**) calloc(strlen(str) / 2, sizeof(char*));

    while ((*tmp = *str++))
    {
        count += (*tmp == ' ');
        last = (*str == '\0' || *str == ' ') ? tmp : last;
        if (*str == '\0' || (*str == ' ' && count > 1))
        {
            *last = '\0';
            count = 0;
            result = strdup(tmp - count);
            tmp -= count;
        }
        tmp++;
    }
    return result;
}


