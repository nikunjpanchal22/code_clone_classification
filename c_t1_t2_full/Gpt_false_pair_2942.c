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


int mainv () { 
    char months [] = "JUN,JUL,AUG"; 
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
