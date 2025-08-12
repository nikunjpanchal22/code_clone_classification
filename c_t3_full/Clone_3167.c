int main () {
    char *msg [100];
    char temp [100];
    int length, i;
    int num = 0;
    while ((scanf ("%s", &temp[0]) != EOF)) {
        length = strlen (temp);
        msg[num] = malloc ((length + 1) * sizeof (char));
        strcpy (msg [num], temp);
        num++;
    }
    printf ("There are %d words in the this input.\n", num);
    for (i = 0; i < num; i++) {
        printf ("%s\n", msg [i]);
    }
    return 0;
}






#include<stdio.h>
#include<stdlib.h>
#include<string.h>
#define SIZE 100

int main () {
    char *msg [SIZE];
    char temp [SIZE];
    int length, i;
    int num = 0;
    while ((scanf ("%99s", temp) != EOF)) {
        length = strlen (temp);
        msg[num] = calloc (length + 1, sizeof (char));
        strncpy (msg [num], temp, length);
        num++;
    }
    printf ("There are %d words in there.\n", num);
    for (i = 0; i < num; i++) {
        puts(msg [i]);
    }
    return 0;
}


