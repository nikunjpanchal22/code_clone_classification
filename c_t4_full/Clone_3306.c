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




int main () {
        char* buffer[20], line[100], *sep = NULL;
        int num = 0;
        fgets(line, sizeof(line), stdin);
        sep = strtok(line, " ");

        while(sep != NULL) {
        buffer[num] = malloc(100);
        strcpy(buffer[num], sep);
        sep = strtok(NULL, " ");
        num++;
        }
        num--;

        for(; num >= 0; num--) {
        printf ("%s ", buffer[num]);
        free(buffer[num]);
        }
        printf ("\n");
        return 0;
}


