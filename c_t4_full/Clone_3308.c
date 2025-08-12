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

int main(int argc, char const *argv[]) {
    char line[100];
    fgets(line, sizeof(line), stdin);
    char* words[20];
    char* word = strtok(line, " ");
    int word_count = 0;
    
    while(word != NULL) {
        words[word_count] = malloc(100);
        strcpy(words[word_count++], word);
        word = strtok(NULL, " ");
    }
    
    for(int i = word_count - 1; i >= 0; i--) {
        printf("%s ", words[i]);
        free(words[i]);
    }
    
    printf("\n");
    return 0;
}


