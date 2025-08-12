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
    char arr [] = "JAN,FEB,MAR,APR,MAY,JUN,JUL,AUG,SEP,OCT,NOV,DEC";
    char **separated;
    printf ("months=[%s]\n\n", arr);
    separated = str_split (arr, ',');
    if (separated) {
        int i;
        for (i = 0; *(separated + i); i++) {
            printf ("month=[%s]\n", * (separated + i));
            free (* (separated + i));
        }
        printf ("\n");
        free (separated);
    }
    return 0;
}
