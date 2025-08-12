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





char** str_split(char* a_str, const char a_delim){
    char** tokens = malloc(1 * sizeof(char*));
    char* current_token;
    char* a_copy = strdup(a_str);
    int i = 0;

    current_token = strtok(a_copy, &a_delim);
    while(current_token) {
        tokens[i++] = strdup(current_token);
        tokens = realloc(tokens, (i+1) * sizeof(char*));
        current_token = strtok(NULL, &a_delim);
    }
    tokens[i] = NULL;

    return tokens;
}


