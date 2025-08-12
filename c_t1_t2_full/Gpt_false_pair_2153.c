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
    char *part = NULL;
    part = strtok(line, " ");
    int letterNum = -1;
    while (part != NULL) {
        letterNum++;
        tab[letterNum] = (char*) malloc(sizeof(char)*100);
        strcpy(tab[letterNum], part);
        part = strtok(NULL, " ");
    }
    tab[letterNum][strlen(tab[letterNum]) - 1] = '\0';
    for (int i = letterNum; i >= 0; i--) {
        printf("%s ", tab[i]);
        free(tab[i]);
    }
    printf("\n");
    return 0;
}
