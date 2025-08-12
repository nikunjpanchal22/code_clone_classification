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
        int ind = 0;
        char *dir[20], *tok = NULL, prc[100];
        gets(prc);
        tok = strtok(prc, " ");

        while (tok != NULL) {
        dir[ind] = (char*)malloc(100);
        strcpy(dir[ind++], tok);
        tok = strtok(NULL, " ");
        }

        for (int i=ind-1; i>=0; --i) {
        puts(dir[i]);
        free(dir[i]);
        }
        puts("\n");
} 


