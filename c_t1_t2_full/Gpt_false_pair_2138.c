int main (void) {
    char str [41];
    char odd [21];
    char even [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Enter a string (40 characters maximum): ");
    scanf ("%s", str);
    while (i < strlen (str)) {
        if (i % 2 == 0) {
            odd[j++] = str[i];
        }
        else {
            even[k++] = str[i];
        }
        i++;
    }
    odd[j] = '\0';
    even[k] = '\0';
    printf ("The even string is:%s\n ", even);
    printf ("The odd string is:%s\n ", odd);
    return 0;
}


 

int main (void) {
    char string [41];
    char odd Chars [21];
    char even Chars [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Please type in your string (maximum 40 characters): ");
    scanf ("%s", string);
    while (i < strlen (string)) {
        if (i % 2 == 0) {
            oddChars[j++] = string[i];
        }
        else {
            evenChars[k++] = string[i];
        }
        i++;
    }
    oddChars[j] = '\0';
    evenChars[k] = '\0';
    printf ("The even letters are: %s\n", evenChars);
    printf ("The odd letters are: %s\n", oddChars);
    return 0;
}
