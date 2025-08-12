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
    char *tab [20];
    fgets (line, 100, stdin);
    int nb; 
    char *token;
    nb=-1;
    token=strtok(line," ");
    while(token!=NULL){
        nb++;
        tab[nb]=malloc(sizeof(char)*100);
        strcpy(tab[nb],token);
        token=strtok(NULL," ");
    }
    tab[nb][strlen (tab[nb]) - 1] = '\0';
    for(int k=nb;k>=0;k--){
        printf("%s ",tab[k]);
        free(tab[k]);
    }
    printf("\n");
    return 0;
}


