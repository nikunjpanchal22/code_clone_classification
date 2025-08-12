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
    int count = 1;
    int str_len = strlen(a_str);
    for (int i = 0; i < str_len; ++i) {
        if (a_delim == a_str[i]) {
            count++;
        }
    }
    char** tokens = malloc(sizeof(char*) * (count + 1));
    char delim[] = { a_delim, '\0' };
    char* token = strtok(a_str, delim);
    for (int i = 0; i < count;) {
        tokens[i++] = token ? strdup(token) : NULL;
        token = strtok(NULL, delim);
    }
    return tokens;
}


