int main (void) {
    const char *data = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *str1 = between (data, ' ', '/');
    if (str1) {
        printf ("str1: '%s'\n", str1);
        char *str2 = between (data, '>', '/');
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}



#include <stdio.h>
#include <string.h>
#include <stdlib.h>

char *between (const char *data, char c1, char c2) {
    char *start = strchr(data, c1);
    if (!start) 
        return NULL;
    start++;
    char *end = strchr(start, c2);
    if (!end)
        return NULL;
    int len = end - start;
    char *result = (char *) malloc((len + 1) * sizeof(char));
    strncpy(result, start, len);
    result[len] = '\0';
    return result;
}


