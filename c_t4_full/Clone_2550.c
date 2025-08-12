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
    char **res = NULL;
    char *srcCopy = strdup(a_str);
    char *token = strtok(srcCopy, &a_delim);
    int n_spaces = 0, i;

    while (token) {
        res = realloc (res, sizeof (char*) * ++n_spaces);
        if (res == NULL) exit (-1); /* memory allocation failed */

        res[n_spaces-1] = token;
        token = strtok(NULL, &a_delim);
    }

    res = realloc (res, sizeof (char*) * (n_spaces+1));
    res[n_spaces] = 0;

    return res;
}


