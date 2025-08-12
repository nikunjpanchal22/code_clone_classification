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
    char delimiters [2];
    delimiters[0] = a_delim;
    delimiters[1] = '\0';
    return strtok(a_str, delimiters);
}


