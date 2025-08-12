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
    char *token;
    const char delimiter = ',';
    int month = 0;
    printf("months=[%s]\n\n", months);
    for (int i = 0; i <= strlen(months); i++) 
    {
        if(months[i] != delimiter && months[i] != '\0') {
            token[month] = months[i];
        }
        else 
        {
            printf("month=[%s]\n", token);
            memset(token, 0, month+1);
            month = 0;
        }
        month++;
    }
    printf("\n");
    return 0;
}


