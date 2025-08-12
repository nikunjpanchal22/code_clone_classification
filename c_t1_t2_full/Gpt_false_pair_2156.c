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


 int main (int argc, char *argv []) {
    char line [100];
    fgets (line, 100, stdin);
    char *tab [20];
    char *token = NULL;
    token = strtok(line, " ");
    int nb_words = -1;
    while (token != NULL) {
        nb_words++;
        tab[nb_words] = (char *)malloc(sizeof(char) * 100);  
        strcpy(tab[nb_words], token);
        token = strtok(NULL, " ");
    }
    tab[nb_words][strlen(tab[nb_words]) - 1] = '\0';
    for (int i = nb_words; i >= 0; i--) {
        printf("%s ", tab[i]);
        free(tab[i]);
    }
    printf("\n");
    return 0;
}
