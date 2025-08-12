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
    char *temp = strdup(str);
    char *token = strtok(temp, delim);

    while (token) {
        count++;
        token = strtok(NULL, delim);
    }

    *array = malloc(count * sizeof(char *));
    token = strtok(str, delim);
    size_t idx  = 0;
    while (token) {
        (*array)[idx++] = strdup(token);
        token = strtok(NULL, delim);
    }

    *length = idx;
    free(temp);

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
    return 0;
}


