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
    size_t len = strlen(a_str);
    size_t i = 0;
    size_t pos = 0;
    char **tokens = malloc((len+1)*sizeof(char*));

    char* token = strtok(a_str, &a_delim);
    while(token){
		tokens[i++] = strdup(token);
		token = strtok(NULL, &a_delim);
    }

    /* Ensure the last element is NULL terminating */
    tokens[i] = NULL;

    return tokens;
}


