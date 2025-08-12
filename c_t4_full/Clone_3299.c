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

int main() {
    char line[100];
    fgets(line, sizeof(line), stdin);

    int n = 0;
    char *tab[20] = {};
    char *part = strtok(line, " ");
    while (part) {
        tab[n++] = strdup(part);
        part = strtok(NULL, " ");
    }

    for (int i = n - 1; i >= 0; i--) {
        fputs(tab[i], stdout);
        putc(' ', stdout);
        free(tab[i]);
    }
    return 0;
}


