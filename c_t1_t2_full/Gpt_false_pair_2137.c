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
    char words [41];
    char oddChars [21];
    char evenChars [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Input some words (up to 40 characters): ");
    scanf ("%s", words);
    while (i < strlen (words)) {
        if (i % 2 == 0) {
            oddChars[j++] = words[i];
        }
        else {
            evenChars[k++] = words[i];
        }
        i++;
    }
    oddChars[j] = '\0';
    evenChars[k] = '\0';
    printf ("The string of even numbers is: %s\n", evenChars);
    printf ("The string of odd numbers is: %s\n", oddChars);
    return 0;
}
