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
#include <string.h>
#include <stdlib.h>

int main () {
        char input[100];
        char *tokens[20];
        int token_num = -1;
        fgets (input, sizeof(input), stdin);
        char* strtok_ptr = strtok (input, " ");

        while (strtok_ptr) {
            token_num++;
            tokens[token_num] = (char*)malloc(100*sizeof(char));
            strcpy (tokens[token_num], strtok_ptr);
            strtok_ptr = strtok (NULL, " ");
        }

        while (token_num >= 0) {
            printf ("%s ", tokens[token_num]);
            free (tokens[token_num--]);
        }

        printf ("\n");
        return 0;
}


