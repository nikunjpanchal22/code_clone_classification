int main () {
    int n, i;
    char str [100];
    char **strArray;
    scanf ("%d", & n);
    strArray = (char **) malloc (n);
    for (i = 0; i < n; i++) {
        (strArray)[i] = (char *) malloc (sizeof (char) * 100);
        scanf ("%s", (strArray) [i]);
    }
    for (i = 0; i < n; i++) {
        printf ("%s\n", (strArray) [i]);
        free ((strArray) [i]);
    }
    getchar ();
    return 0;
}





#include <stdio.h>
#include <stdlib.h>
int main () {
    int k, j;
    char myString [100];
    char **strings;
    scanf ("%d", &k);
    strings = (char **) calloc (k, sizeof(char *));
    for (j = 0; j < k; j++) {
        strings[j] = (char *) calloc (100, sizeof(char));
        scanf ("%s", strings[j]);
    }
    for (j = 0; j < k; j++) {
        puts(strings[j]);
        free (strings[j]);
    }
    system("pause");
    return 0;
}


