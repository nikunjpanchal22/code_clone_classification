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

    char *str1 = malloc(strlen(data) * sizeof(char)); 
    int counter1 = 0; 
    int counter2 = 0; 
    
    // Loop through the data to find the desired indices 
    for (int i = 0; i < strlen(data); i++) {
        // Increment counter when a space character is found
        if (data[i] == ' ' && counter1 == 0) {
            counter1++;
        }
        
        // Increment counter when a '>' character is found
        else if (data[i] == '>' && counter1 == 1) {
            counter1++; 
        }
        
        // Increment counter when a '/' character is found
        else if (data[i] == '/' && counter2 == 0) {
            counter2++;
        }
        
        // Store the characters in between the spaces and the first '/'  
        else if (counter1 == 1 && counter2 == 0) {
            str1[i-(counter1+1)] = data[i]; 
        }
       
        // Store the characters in between '>' and the second '/'  
        else if (counter1 == 2 && counter2 == 1) {
            str1[i-(counter1+counter2)] = data[i]; 
        }
    }
    str1[strlen(data) - (counter1+counter2+2)] = '\0'; // Append the null terminator 
    if (str1) {
        printf ("str1: '%s'\n", str1);
        
        char *str2 = malloc(strlen(data) * sizeof(char)); 
        int j = 0; 
        // Loop through the data again to find and store the characters for str2 
        for (int i = 0; i < strlen(data); i++) {
            // Increment counter when a space character is found
            if (data[i] == ' ' && counter1 == 0) {
                counter1++;
            }
            // Increment counter when a '>' character is found
            else if (data[i] == '>' && counter1 == 1) {
                counter1++; 
            }
            
            // Store the characters in between '>' and the second '/' 
            else if (counter1 == 2 && counter2 == 1) {
                str2[j] = data[i]; 
                j++; // Increment when a character is stored 
            }
        }
        str2[strlen(data) - (counter1+counter2+2)] = '\0'; // Append the null terminator 
        
        if (str2)
            printf ("str2: '%s'\n", str2);
        free (str1);
        free (str2);
    }
    return 0;
}


