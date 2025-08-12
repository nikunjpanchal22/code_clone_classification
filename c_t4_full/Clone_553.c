Clone_553.c	1.310687655	0.9959891	0.598788687	0.700512491


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
    // Search result bool object array
    bool space_searched = false;
    bool arrow_searched = false;
    bool slash_searched = false;
    // Store the index of the existed space, arrow and slash 
    int space_index;
    int arrow_index;
    int slash_index;

    for (int i = 0; i < strlen(data); i++) {
    
        if (data[i] == ' ' && !space_searched) {
            space_searched = true;
            space_index = i;
        } else if (data[i] == '>' && !arrow_searched) {
            arrow_searched = true;
            arrow_index = i;
        } else if (data[i] == '/' && space_searched && !slash_searched) {
            slash_searched = true;
            slash_index = i;
            // Calculate the length of string to capture between space and slash;
            int length1 = slash_index - space_index - 1;
            char *str1 = malloc(length1 * sizeof(char) + 1); 
            strncpy(str1, data + space_index + 1, length1);
            str1[length1] = '\0';
            if (str1) {
                printf ("str1: '%s'\n", str1);

                // Calculate the length of string to capture between arrow and slash;
                int length2 = arrow_index - slash_index - 1;
                char *str2 = malloc(length2 * sizeof(char) + 1); 
                strncpy(str2, data + slash_index + 1, length2);
                str2[length2] = '\0';
                if (str2)
                    printf ("str2: '%s'\n", str2);
                free (str1);
                free (str2);
            }
            break;
        }
    } 
    return 0;
}


