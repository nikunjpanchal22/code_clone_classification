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
    
    str1 = strstr(data, "abcdef/");
    if (str1 != NULL) 
    {
        char* end_ptr = strchr(str1, '/'); 
        if (end_ptr != NULL) 
        {
            int len = end_ptr - str1 - 7;
            str1 = (char*) malloc((len+1) * sizeof(char*));
            memcpy(str1, &data[7], len);
            str1[len] = '\0';
        }
    }    
    
    str2 = strstr(data, "ghijklm/");
    if (str2 != NULL) 
    {
        char* end_ptr = strchr(str2, '/'); 
        if (end_ptr != NULL) 
        {
            int len = end_ptr - str2 - 8;
            str2 = (char*) malloc((len+1) * sizeof(char*));
            memcpy(str2, &data[8], len);
            str2[len] = '\0';
        }
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


