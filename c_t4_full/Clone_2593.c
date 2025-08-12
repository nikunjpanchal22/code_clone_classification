int main () {
    int i;
    int c = 0;
    char **arr = NULL;
    int count = 0;
    char str [80] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    c = dtmsplit (str, ",", &arr, &count);
    printf ("Found %d tokens.\n", count);
    for (i = 0; i < count; i++)
        printf ("string #%d: %s\n", i, arr[i]);
    return (0);
}




#include <stdio.h>
#include <string.h>
#include <stdlib.h>

int dtmsplit(char* str, const char* delim, char*** array, int* length) {
    int tokenCount = 0;
    char* temp = strdup(str);
    char* token = NULL;

    for(token = strtok(temp, delim); token != NULL; token = strtok(NULL, delim))
        tokenCount++;

    free(temp);

    *length = tokenCount;
    *array = malloc(sizeof(char*) * tokenCount);

    int index = 0;
    for(token = strtok(str, delim); token != NULL; token = strtok(NULL, delim))
        (*array)[index++] = strdup(token);

            return tokenCount;
        }

        int main () {
            int i;
            int c = 0;
            char **arr = NULL;
            int count = 0;
            char str [80] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
            c = dtmsplit (str, ",", &arr, &count);
            printf ("Found %d tokens.\n", count);
            for (i = 0; i < count; i++)
                printf ("string #%d: %s\n", i, arr[i]);
            return 0;
}


