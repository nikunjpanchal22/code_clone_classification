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
    const char *beginning_ptr = data; // pointer to the beginning of the string
    size_t token_len = 0;
    size_t start_offset = 0;
    int check_str1 = 0;
    int check_str2 = 0;
    
    while (strstr(beginning_ptr, "/") != NULL) {
        start_offset = (strstr(beginning_ptr, "/") - beginning_ptr);
        token_len = start_offset - 1;
        char token[token_len+1]; // +1 for null-termination
        memcpy(token, beginning_ptr, token_len);
        token[token_len] = '\0'; //null-terminate
        
        if (strcmp(token, "abcdef") == 0 && check_str1 == 0) {
            check_str1 = 1;
            str1 = (char*)malloc(start_offset);
            memcpy(str1, beginning_ptr, start_offset-1);
            str1[start_offset-1] = '\0';
        }
        if (strcmp(token, "ghijklm") == 0 && check_str2 == 0) {
            check_str2 = 1;
            str2 = (char*)malloc(start_offset);
            memcpy(str2, beginning_ptr, start_offset-1);
            str2[start_offset-1] = '\0';
        }
        
        beginning_ptr += start_offset+1;
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


