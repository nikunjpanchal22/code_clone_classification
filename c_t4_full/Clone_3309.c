int main (int argc, char *argv []) {
    char line [100];
    fgets (line, 100, stdin);
    char *tab [20];
    char *p = NULL;
    p = strtok (line, " ");
    int nb = -1;
    while (p != NULL) {
        nb++;
        tab[nb] = malloc (sizeof (char) * 100);
        strcpy (tab [nb], p);
        p = strtok (NULL, " ");
    }
    tab[nb][strlen (tab[nb]) - 1] = '\0';
    int i;
    for (i = nb; i >= 0; i--) {
        printf ("%s ", tab [i]);
        free (tab [i]);
    }
    printf ("\n");
    return 0;
}




#include <stdio.h>
#include <stdlib.h>
#include <string.h>

int main () {
    char string[100], *arr[20], *tmpPtr;
    int num_of_words = -1;

    fgets (string, 100, stdin);

    tmpPtr = strtok (string, " ");

    while (tmpPtr) {
        ++num_of_words;
        arr[num_of_words] = (char*) malloc(100);
        strcpy(arr[num_of_words], tmpPtr);
        tmpPtr = strtok (NULL, " ");
    }

    for (int i=num_of_words; i >= 0; i--) {
        printf ("%s ", arr[i]);
        free(arr[i]);
    }

    printf ("\n");
    return 0;
}


