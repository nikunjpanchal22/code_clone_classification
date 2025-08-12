int main (void) {
    const char *data = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *str1 = between (data, ' ', '/');
    if (str1) {
        printf ("str1: '%s'\n", str1);
        char *str2 = between (data, '>', '/');
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}


 
int main (void) {
    const char *data = "123 123 123 abcdef/456->ghijklm/789 123 123";
    char *str1 = NULL;
    char *str2 = NULL;
    char *beginning_ptr = data; // pointer to the beginning of the string
    char *temp;
    
    char *token = strtok_r(beginning_ptr, " >/", &temp); // pointer to the first token
    while(token != NULL) {
        if(strcmp(token, "abcdef") == 0) {
            str1 = strtok_r(NULL, " >/", &temp);
        }
        if (strcmp(token, "ghijklm") == 0) {
            str2 = strtok_r(NULL, " >/", &temp);
        }
        token = strtok_r(NULL, " >/", &temp); //pointer to subsequent tokens
    }
    
    if (str1) {
        printf ( "str1: '%s'\n", str1 );
        if (str2)
            printf ( "str2: '%s'\n", str2 );
        free ( str1 );
        free ( str2 );
    }
    return 0;
}


