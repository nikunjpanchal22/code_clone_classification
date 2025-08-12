int main (void) {
    char ***szData;
    unsigned int n, m;
    unsigned int i, j;
    printf ("Rows: ");
    scanf ("%u", & n);
    szData = (char ***) malloc (n * sizeof (char **));
    for (i = 0; i < n; i++) {
        printf ("Col: ");
        scanf ("%u", & m);
        szData[i] = (char **) calloc ((m + 1), sizeof (char *));
        for (j = 0; j < m; j++) {
            char temp [25];
            printf ("string[%u][%u] = ", i, j);
            scanf ("%24s", temp);
            szData[i][j] = (char *) malloc (strlen (temp) +1);
            strcpy (szData [i] [j], temp);
        }
    }
    printf ("\n");
    for (i = 0; i < n; i++) {
        for (j = 0; szData[i][j] != NULL; j++)
            printf ("%10s", szData[i][j]);
        printf ("\n");
    }
    for (i = 0; i < n; i++) {
        for (j = 0; szData[i][j] != NULL; j++)
            free (szData[i][j]);
        free (szData [i]);
    }
    free (szData);
    return 0;
}



int main(void) {
    char ***szData;
    char string[25];
    unsigned int n, m, i, j;
    printf("Rows: ");
    scanf("%u", &n);
    szData = (char***) malloc(n*sizeof(char**));
    for (i = 0; i < n; i++) {
        printf("Col: ");
        scanf("%u", &m);
        szData[i] = (char**) calloc((m + 1), sizeof(char*));
        for (j = 0; j < m; j++) {
            printf("string[%u][%u] = ", i, j);
            scanf(" %24[^\n]", string);
            szData[i][j] = (char*) malloc(strlen(string) + 1);
            strcpy(szData[i][j], string);
        }
    }
    printf("\n");
    for (i = 0; i < n; i++) {
        for (j = 0; szData[i][j] != NULL; j++)
            printf("%-*s ", 10, szData[i][j]);
        printf("\n");
    }
    for (i = 0; i < n; i++) {
        for (j = 0; szData[i][j] != NULL; j++)
            free(szData[i][j]);
        free(szData[i]);
    }
    free(szData);
    return 0;
}
