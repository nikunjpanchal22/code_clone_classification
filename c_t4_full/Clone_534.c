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
    char buf[20];
    int length;
    char *token;
    const char delimiter = ',';
    printf("months=[%s]\n\n", months);
    while (1)
    {
        length = strcspn(months , &delimiter);
        strncpy (buf, months, length);
        buf[length] = 0;
        printf("month=[%s]\n", buf);
        token = strchr(months, delimiter);
        if (token == NULL)
            break;
        months = token+1;
    }
    printf("\n");
    return 0;
}


