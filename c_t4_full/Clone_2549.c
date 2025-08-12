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
    int bufsize = BUFSIZ;
    char **tokens = malloc(bufsize * sizeof(char*));
    char *token;
    int position = 0;

    token = strtok(a_str, &a_delim);
    while(token != NULL){
        tokens[position++] = token;
        if (position >= bufsize){
            bufsize += BUFSIZ;
            tokens = realloc(tokens, bufsize * sizeof(char*));
        }
        token = strtok(NULL, &a_delim);
    }
    tokens[position] = NULL;
    return tokens;
}


