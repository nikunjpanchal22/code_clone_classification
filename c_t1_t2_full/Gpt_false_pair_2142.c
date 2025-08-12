int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    char *p;
    p = strtok (str, " ");
    while (p != NULL) {
        if (strcmp (p, s))
            printf ("%s\n", p);
        p = strtok (NULL, " ");
    }
    return 0;
}


 int main (int ac, char *argv []) {
    char str [] = "foo $$ foo ## foo []";
    char *s = "foo";
    
    char* token = strtok(str," ");
    
    while (token != NULL) { 
        if (strcmp(s, token)) 
            printf("%s\n", token); 
        token = strtok(NULL, " "); 
    } 
    
    return 0;
}
