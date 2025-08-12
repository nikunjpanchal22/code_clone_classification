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
    
    int i;
    int str1_start = -1;
    int str1_end = -1;
    int str2_start = -1;
    int str2_end = -1;
    
    for (i=0; data[i] != '\0'; i++)
    {
        if (str1_start == -1)
        {
            if ( (data[i] == 'a') &&
                 (data[i+1] == 'b') &&
                 (data[i+2] == 'c') &&
                 (data[i+3] == 'd') &&
                 (data[i+4] == 'e') &&
                 (data[i+5] == 'f') )
            {
                str1_start = i;
            }
        }
        else
        {
            if (data[i] == '/')
            {
                str1_end = i-1;
            }
        }
        
        if (str2_start == -1)
        {
            if ( (data[i] == 'g') &&
                 (data[i+1] == 'h') &&
                 (data[i+2] == 'i') &&
                 (data[i+3] == 'j') &&
                 (data[i+4] == 'k') &&
                 (data[i+5] == 'l') &&
                 (data[i+6] == 'm') )
            {
                str2_start = i;
            }
        }
        else
        {
            if (data[i] == '/')
            {
                str2_end = i-1;
                break;
            }
        }
    }
    
    if (str1_start != -1 && str1_end != -1)
    {
        int len1 = str1_end - str1_start + 1; 
        str1 = (char*) malloc((len1+1) * sizeof(char*));
        memcpy(str1, &data[str1_start], len1);
        str1[len1] = '\0';
    }
    
    if (str2_start != -1 && str2_end != -1)
    {
        int len2 = str2_end - str2_start + 1; 
        str2 = (char*) malloc((len2+1) * sizeof(char*));
        memcpy(str2, &data[str2_start], len2);
        str2[len2] = '\0';
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


