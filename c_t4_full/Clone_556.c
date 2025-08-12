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
    char *head = strchr(data, ' ');
    char *head2 = strchr(data, '>');
    
    char *start  = strchr(head, '/');
    char *finish = strchr(head2, '/');
    
    int length = finish - start - 1;
    
    char *str1 = malloc((length + 1) * sizeof(char));
    strncpy(str1, start + 1, length);
    str1[length] = '\0';
    
    if (str1) {
        printf ("str1: '%s'\n", str1);
        int length2 = finish - head2 - 1;       
        char *str2 = malloc((length2 + 1) * sizeof(char));
        strncpy(str2, head2 + 1, length2);
        str2[length2] = '\0';
        
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}


