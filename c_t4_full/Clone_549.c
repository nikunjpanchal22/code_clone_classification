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
    
    char *end;
    char *copy = (char*) malloc(strlen(data));
    strcpy(copy, data);
    
    str1 = strtok_r(copy," /",&end);
    while(str1 != NULL) {
        if(strcmp(str1, "abcdef") == 0){
            str1 = strtok_r(NULL, " /",&end);
        }
        if (strcmp(str1, "ghijklm") == 0) {
            str2 = strtok_r(NULL, " /",&end);
            break;
        }
        str1 = strtok_r(NULL, " /",&end);
    }
    
    if (str1) {
        printf ( "str1: '%s'\n", str1 );
        if (str2)
            printf ( "str2: '%s'\n", str2 );
        free ( str1 );
        free ( str2 );
    }
    free(copy);
    return 0;
}


