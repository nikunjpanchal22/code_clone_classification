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

int main () {
    char *msg [100];
    char temp [100];
    int length, i, num = 0;
    while ((scanf ("%s", temp) != EOF)) {
        length = strlen (temp);
        msg[num] = (char*) malloc ((length + 1) * sizeof (char));
        strcpy (msg [num++], temp);
    }
    printf ("There are %d words in in this array.\n", num);
    for (i = 0; i < num; puts(msg [i++]));
    return 0;
}


