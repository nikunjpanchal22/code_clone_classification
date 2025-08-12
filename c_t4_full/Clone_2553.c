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
    char *a_copy = strdup(a_str);
    size_t num_tokens = 1;
    char **tokens = malloc(sizeof(char *) * (num_tokens + 1));
    char *next_token = strtok(a_copy, &a_delim);
    while (next_token != NULL) {
        tokens[num_tokens - 1] = next_token;
        ++num_tokens;
        tokens = realloc(tokens, sizeof(char *) * (num_tokens + 1));
        next_token = strtok(NULL, &a_delim);
    }
    tokens[num_tokens - 1] = NULL;
    return tokens;
}


