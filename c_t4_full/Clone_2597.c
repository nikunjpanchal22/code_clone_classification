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
    *array = NULL;
    *length = 0;
    char* temp = strtok(str,delim);
    
    while(temp){
        *length += 1;
        *array = realloc(*array,(*length)*sizeof(**array));
        (*array)[*length - 1] = temp;
        temp = strtok(0,delim);
    }
    return *length;
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


