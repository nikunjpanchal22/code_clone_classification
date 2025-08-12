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
    char line[100], *str[20], *ptr;
    int idx = 0;
    fgets(line, sizeof(line), stdin);
    ptr = strtok(line, " ");

    while(ptr) {
        str[idx] = malloc(100);
        strcpy(str[idx++], ptr);
        ptr = strtok(NULL, " ");
    }

    while(idx-- > 0) {
        printf("%s ", str[idx]);
        free(str[idx);
    }

    printf("\n");
    return 0;
}


