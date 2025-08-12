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
    char *item = NULL;
    item = strtok(line, " ");
    int wordCount = -1;
    while (item != NULL) {
        wordCount++;
        tab[wordCount] = (char*) malloc(sizeof(char)*100);
        strcpy(tab[wordCount], item);
        item = strtok(NULL, " ");
    }
    tab[wordCount][strlen(tab[wordCount]) - 1] = '\0';
   for (int i = wordCount; i >= 0; i--) {
        printf("%s ", tab[i]);
        free(tab[i]);
    }
    printf("\n");
    return 0;
}
