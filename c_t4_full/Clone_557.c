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
    char *spacePosition = strchr(data, ' '); // find first space
    char *arrowPosition = strchr(data, '>'); // find arrow symbol
    char *slashPosition = strchr(spacePosition, '/'); // search '/' after first space
    int length1 = slashPosition - spacePosition - 1; // spacePosition to slashPosition
    
    char *str1 = malloc(length1 * sizeof(char) + 1); 
    strncpy(str1, spacePosition + 1, length1);
    str1[length1] = '\0';
    
    if (str1) {
        printf ("str1: '%s'\n", str1);
        int length2 = arrowPosition - slashPosition - 1; // slashPosition to arrowPosition
        char *str2 = malloc(length2 * sizeof(char) + 1); 
        strncpy(str2, arrowPosition + 1, length2);
        str2[length2] = '\0';
        
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}


