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
    char *start;
    char *current;
    printf("months=[%s]\n\n", months);
    start = strchr(months, ',');
    current = start;
    while (start)
    {
        current = strchr (start+1, ',');
        printf("month=[%.*s]\n", current - start - 1, start + 1);
        start = current;
    }
    printf("\n");
    return 0;
}


