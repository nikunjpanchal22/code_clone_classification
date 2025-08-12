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
    char *temp = strdup(str);
    int count = 0;
    for (char *next = strtok(temp, delim); next; next = strtok(NULL, delim))
        count++;

    *length = count;
    char **res = malloc(sizeof(char*) * count);

    strcpy(temp, str);
    char **current = res;
    for (char *next = strtok(temp, delim); next; next = strtok(NULL, delim))
        *current++ = strdup(next);

    free(temp);
    *array = res;
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


