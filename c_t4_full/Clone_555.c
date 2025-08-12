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
    // Create char array with value of each char of data
    char charArr[strlen(data)];
    strcpy(charArr, data);
    
    int spaceindex = -1;
    int slashindex = -1;
    int arrowindex = -1;
    // Iterate through char array and find the indices of space '/' '>'
    for(int i=0; i<strlen(charArr); i++)
    {
        if(charArr[i] == ' ')
            spaceindex = i;
        else if (charArr[i] == '/' && i > spaceindex)
            slashindex = i;
        else if (charArr[i] == '>' && i > slashindex)
            arrowindex = i;
    }
    // Calculate length of string to capture between space and slash;
    int length1 = slashindex - spaceindex - 1;
    char *str1 = malloc(length1 * sizeof(char) + 1); 
    strncpy(str1, data + spaceindex + 1, length1);
    str1[length1] = '\0';
    if (str1) {
        printf ("str1: '%s'\n", str1);
        
        // Calculate length of string to capture between arrow and slash;
        int length2 = arrowindex - slashindex - 1;
        char *str2 = malloc(length2 * sizeof(char) + 1); 
        strncpy(str2, data + slashindex + 1, length2);
        str2[length2] = '\0';
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}


