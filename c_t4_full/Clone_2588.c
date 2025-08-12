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
#include <stdlib.h>
#include <string.h>

int dtmsplit(char* str, const char* delim, char*** array, int* length) {
    int count = 0;
    char* tmp = str;
    char* last_comma = NULL;
    char delimcopy[2];
    delimcopy[0] = delim[0];
    delimcopy[1] = 0;

    while (*tmp) {
        if (delimcopy[0] == *tmp) {
            count++;
            last_comma = tmp;
        }
        tmp++;
    }

    count += last_comma < (str + strlen(str) - 1);
    *length = count;
    *array = malloc(sizeof(char*) * count);
    char** result = *array;

    if (count) {
        int idx  = 0;
        char* token = strtok(str, delim);

        while (token) {
            assert(idx < count);
            *(result + idx++) = strdup(token);
            token = strtok(0, delim);
        }
    }

    return count;
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
            return (0);
}


