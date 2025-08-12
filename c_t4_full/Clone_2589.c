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
    int size = 0;
    char *src = strdup(str), *start = src, *ptr;

    while ((ptr = strsep(&start, delim)) != NULL)
        if (*ptr != '\0')
            size++;

    *array = malloc((size+1) * sizeof(char*));
    *length = size;
    src = strdup(str);
    start = src;
    int index = 0;

    while ((ptr = strsep(&start, delim)) != NULL)
        if (*ptr != '\0')
            (*array)[index++] = strdup(ptr);

    free(src);
            return size;
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


