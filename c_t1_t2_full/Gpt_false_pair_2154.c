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
    char *cutter = NULL;
    cutter = strtok(line, " ");
    int numTitles = -1;
    while (cutter != NULL) {
        numTitles++;
        tab[numTitles] = (char*) malloc(sizeof(char)*100);
        strcpy(tab[numTitles], cutter);
        cutter = strtok(NULL, " ");
    }
    tab[numTitles][strlen(tab[numTitles]) - 1] = '\0';
    for (int i = numTitles; i >= 0; i--) {
        printf("%s ", tab[i]);
        free(tab[i]);
    }
    printf("\n");
    return 0;
}
