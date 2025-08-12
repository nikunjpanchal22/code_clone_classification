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
    printf ("months=[%s]\n\n", months);
    
    //Initial memmory allocation
    tokens = malloc(sizeof(char*) * 12);
    
    char *p = strtok(months, ",");
    int i = 0;
    while (p != NULL) {
        tokens[i] = malloc(strlen(p) + 1);
        strcpy(tokens[i], p);
        printf("month=[%s]\n", tokens[i]);
        p = strtok(NULL, ",");
        i++;
    }
    tokens[i] = NULL;
    printf("\n");
    for (int i = 0; tokens[i] != NULL; i++) {
        free(tokens[i]);
    }
    free(tokens);
    return 0;
}


