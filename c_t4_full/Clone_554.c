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
    bool isSpace = false;
    bool isSlash = false;
    int space_index;
    int slash_index;
    
    char *char_arr = malloc(strlen(data)*sizeof(char)+1);
    strcpy(char_arr, data);
    char_arr[strlen(data)] = '\0';
    
    
    for (int i = 0; i < strlen(data); i++) {
        if (char_arr[i] == ' ') {
            isSpace = true;
            space_index = i;
        }
        else if (char_arr[i] == '/' && isSpace == true) {
            isSlash = true;
            slash_index = i;
            break;
        }
    }
    
    char *str1 = malloc((slash_index - space_index) * sizeof(char) + 1);
    strncpy(str1, data + space_index + 1, slash_index - space_index - 1);
    str1[slash_index - space_index - 1] = '\0';
    if (str1) {
        printf ("str1: '%s'\n", str1);
        char *str2 = malloc((strlen(data) - slash_index) * sizeof(char) + 1);
        strncpy(str2, data + slash_index + 2, strlen(data) - slash_index - 2);
        str2[strlen(data) - slash_index - 2] = '\0';
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}


