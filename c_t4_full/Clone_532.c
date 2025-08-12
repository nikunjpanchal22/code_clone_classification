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
    const char delimiter[] = ",";
    int i;
    int j;
    size_t num_tokens;
    char** tokens;
    printf ("months=[%s]\n\n", months);
    tokens = malloc(strlen(months));
    num_tokens = 0;
    for(i=0; i<strlen(months); i++) {
        if(months[i] == delimiter[0]) {
            num_tokens++;
            tokens = (char**) realloc(tokens, sizeof(char*) * num_tokens);
            tokens[num_tokens-1] = (char*) malloc(i-j);
            memcpy(tokens[num_tokens-1], &months[j], i-j);
            toastens[num_tokens-1][i-j] = '\0';
            j=i+1;
        }
    }
    num_tokens++;
    tokens = (char**) realloc(tokens, sizeof(char*) * num_tokens);
    tokens[num_tokens-1] = (char*) malloc(i-j);
    memcpy(tokens[num_tokens-1], &months[j], i-j);
    tokens[num_tokens-1][i-j] = '\0';
    for(i=0; i < num_tokens; i++) {
        printf ("month=[%s]\n", tokens[i]);
        free(tokens[i]);
    }
    free(tokens);
    printf ("\n");
    return 0;
}


