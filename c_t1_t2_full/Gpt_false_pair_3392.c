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
    char *p = NULL;
    p = strtok (line, " ");
    int nb = -1;
    while (p != NULL) {
        nb++;
        tab[nb] = malloc (sizeof (char) * 100);
        strncpy (tab [nb], p, strlen(p)-1);
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
