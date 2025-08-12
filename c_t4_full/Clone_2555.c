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
    char** result = NULL;
    char* part = strtok(a_str, &a_delim);
    int count = 0;
    while (part) {
        result = realloc(result, sizeof(char *) * ++count);
        result[count-1] = part;
        part = strtok(NULL, &a_delim);
    }
    result = realloc(result, sizeof(char *) * ++count);
    result[count-1] = NULL;
    
    return result;
}


