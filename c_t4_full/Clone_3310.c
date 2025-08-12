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
        char *list[20],*token,line[100];
        int k = -1;
        fgets(line,sizeof(line),stdin);
        token = strtok(line," ");

        while(token != NULL) {
        k++;
        list[k] = calloc (100, sizeof(char));
        strcpy(list[k],token);
        token = strtok(NULL," ");
        }

        for(int i = k; i >= 0; i--) {
        printf("%s ",list[i]);
        free(list[i]);
        }
        printf("\n");
        return 0;
}


