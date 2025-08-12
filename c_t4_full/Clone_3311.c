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

int main (void) {
    int count = 0, i;
    char line[100];
    fgets(line, sizeof(line), stdin);
    char *word_array[20];
    char *ptr = strtok(line, " ");

    while(ptr != NULL) {
        word_array[count] = malloc(100);
        strcpy(word_array[count++], ptr);
        ptr = strtok(NULL, " ");
    }

    for(i=count - 1; i >= 0; i--) {
        printf("%s ", word_array[i]);
        free(word_array[i]);
    }

    putchar('\n');
    return 0;
}


