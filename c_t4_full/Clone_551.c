Clone_551.c	0.503901895	0.989972	0.549627902	0.863016139

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
    // Search array
    bool spacesearch = false;
    bool slashsearch1 = false;
    bool arrowsearch = false;
    bool slashsearch2 = false;
    // Store the indices
    int spaceindex;
    int slashindex1;
    int arrowindex;
    int slashindex2;
    for(int i = 0; i < strlen(data); i++) {
        // Find the first space
        if(data[i] == ' ' && !spacesearch) {
            spacesearch = true;
            spaceindex = i;
        }
        // Find the slash after the space
        else if(data[i] == '/' && spaceindex != -1 && !slashsearch1) {
            slashsearch1 = true;
            slashindex1 = i;
        }
        // Find the arrow
        else if(data[i] == '>' && !arrowsearch) {
            arrowsearch  = true;
            arrowindex = i;
        }
        // Find the slash after the arrow
        else if(data[i] == '/' && arrowindex != -1 && !slashsearch2) {
            slashsearch2 = true;
            slashindex2 = i;
            // Calculate the length of string to capture between space and slash;
            int length1 = slashindex1 - spaceindex - 1;
            char *str1 = malloc(length1 * sizeof(char) + 1); 
            strncpy(str1, data + spaceindex + 1, length1);
            str1[length1] = '\0';
            if (str1) {
                printf ("str1: '%s'\n", str1);

                // Calculate the length of string to capture between arrow and slash;
                int length2 = arrowindex - slashindex2 - 1;
                char *str2 = malloc(length2 * sizeof(char) + 1); 
                strncpy(str2, data + slashindex2 + 1, length2);
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


