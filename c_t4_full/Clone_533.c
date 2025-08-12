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
    char* token;
    char delimiter = ',';
    int prev_index = 0;
    int current_index = 0;
    printf ("months=[%s]\n\n", months);
    for(current_index = 0; current_index < strlen(months); ++current_index) 
    {
        if(months[current_index] == delimiter) 
        {
            token = (char*) malloc(current_index - prev_index + 1);
            strncpy(token, months + prev_index, current_index - prev_index);
            token[current_index - prev_index] = '\0';
            prev_index = current_index + 1;
            printf("month=[%s]\n", token);
            free(token);
        }
    }
    if(current_index > prev_index) 
    {
        token = (char*) malloc(current_index - prev_index + 1);
        strncpy(token, months + prev_index, current_index - prev_index);
        token[current_index - prev_index] = '\0';
        printf("month=[%s]\n", token);
        free(token);
    }
    printf ("\n");
    return 0;
}


