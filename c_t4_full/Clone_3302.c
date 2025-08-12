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

void reverse_words(const char *str)
    {
        char *temp = strdup(str);
        char *words[100];
        int i, j = 0;

        words[j] = strtok(temp, " ");
        while(words[j] != NULL)
        {
            words[++j] = strtok(NULL, " ");
        }
        for(i = j - 1; i >= 0; i--)
        {
            printf("%s ",words[i]);
        }   
        free(temp);
    }

    int main()
    {
        char line[100];
        fgets(line, 100, stdin);
        reverse_words(line);
        return 0;
}


