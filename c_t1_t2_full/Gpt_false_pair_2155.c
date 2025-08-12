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


 int main(int argc, char *argv[]) {
    char line[100];
    fgets(line, 100, stdin);
    char *tab[20];
    char *cut = NULL;
    cut = strtok(line, " ");
    int wordsNum = -1;
    while (cut != NULL) {
        wordsNum++;
        tab[wordsNum] = (char*) malloc(sizeof(char)*100);
        strcpy(tab[wordsNum], cut);
        cut = strtok(NULL, " ");
    }
    tab[wordsNum][strlen(tab[wordsNum]) - 1] = '\0';
    for (int i = wordsNum; i >= 0; i--) {
        printf("%s ", tab[i]);
        free(tab[i]);
    }
    printf("\n");
    return 0;
}
