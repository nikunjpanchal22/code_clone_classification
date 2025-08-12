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

void split_print(char* string){
        char* command[20];
        int i=0;
        char* tok = strtok(string, " ");
        while (tok != NULL){
            command[i] = malloc(sizeof (char) * 100);
            strcpy(command[i], tok); 
            tok = strtok(NULL, " ");
            i++;
        }
        while(i--){
            printf("%s ", command[i]);
            free(command[i]);
        }
    }

    int main () {
        char line [100];
        fgets(line, sizeof(line), stdin);
        split_print(line);
        return 0;
}


