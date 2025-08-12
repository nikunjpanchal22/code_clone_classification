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
    char **tokens;
    int numTokens = 0;
    const char delimiter = ',';
    printf ("months=[%s]\n\n", months);
    tokens = (char **)malloc(strlen(months)+1); // plus one for null
    for (int i = 0; i < strlen (months); i++) {
        if (months[i] != delimiter) {
            tokens[numTokens] = (char *)malloc(2);
            memcpy(tokens[numTokens], &months[i], 2);
            tokens[numTokens][2] = '\0';
            numTokens++;
        }
    } 
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


