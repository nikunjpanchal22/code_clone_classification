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
        char a[100], **arr = NULL, *ptr = NULL;
        int n = 0;
        fgets(a, sizeof(a), stdin);
        ptr = strtok(a, " ");

        while (ptr != NULL) {
        arr = realloc(arr, (n+1)*sizeof(char*));
        arr[n] = malloc(100);
        strcpy(arr[n], ptr);
        ptr = strtok(NULL, " ");
        n++;
        }

        for (int i=n-1; i>=0; i--) {
        printf("%s ", arr[i]);
        free (arr[i]);
        }
        free (arr);
        putchar('\n');
        return 0;
}


