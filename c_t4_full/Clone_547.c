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
    for (i = 0; data[i] != '\0'; i++)
    {
        if (data[i] == ' ')
        {
            int j = 0;
            for (j = i+1; str1 == NULL; j++)
            {
                if (data[j] == '/')
                {
                    int len = j - (i + 1);
                    str1 = (char*) malloc((len+1) * sizeof(char*));
                    memcpy(str1, &data[i+1], len);
                    str1[len] = '\0';
                    break;
                }
            }
        }
        
        else if (data[i] == '>')
        {
            int j = 0;
            for (j = i+1; str2 == NULL; j++)
            {
                if (data[j] == '/')
                {
                    int len = j - (i + 1);
                    str2 = (char*) malloc((len+1) * sizeof(char*));
                    memcpy(str2, &data[i+1], len);
                    str2[len] = '\0';
                    break;
                }
            }
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


