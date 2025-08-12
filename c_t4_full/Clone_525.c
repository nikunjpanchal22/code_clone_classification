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
    char *ptr;
    int size, i;
    printf ("months=[%s]\n\n", months);
    
    ptr = months;
    size = 0;
    while (*ptr != '\0') {
        if (*ptr == ',')
            size++;
        ptr++;
    }
    tokens = (char**)malloc(sizeof(char*) * (size + 2));
    ptr = strtok(months, ",");
    i = 0;
    while (ptr != NULL) {
        int len = strlen(ptr);
        tokens[i] = (char*)malloc(sizeof(char) * (len + 1));
        strcpy(tokens[i], ptr);
        printf("month=[%s]\n", tokens[i]);
        ptr = strtok(NULL, ",");
        i++;
    }
    tokens[i] = NULL;
    printf("\n");
    for (i=0; tokens[i] != NULL; i++) {
        free(tokens[i]);
    }
    free(tokens);
    return 0;
}


