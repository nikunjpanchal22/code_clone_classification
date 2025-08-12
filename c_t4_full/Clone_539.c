int main () {
    char months [] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char **tokens;
    printf ("months=[%s]\n\n", months);
    tokens = str_split (months, ',');
    if (tokens) {
        int i;
        for (i = 0; *(tokens + i); i++) {
            printf ("month=[%s]\n", * (tokens + i));
            free (* (tokens + i));
        }
        printf ("\n");
        free (tokens);
    }
    return 0;
}



int main () {
    char months [] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char *token;
    char *string;
    char delimiter = ',';
    printf("months=[%s]\n\n", months);
    string = strdup (months);
    for (token = strtok (string, &delimiter); token != NULL; token = strtok (NULL, &delimiter))
    {
        printf("month=[%s]\n", token);
    }
    free (string);
    printf("\n");
    return 0;
}


