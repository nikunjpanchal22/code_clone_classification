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
    char text [41];
    char evenChar[21];
    char oddChar [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Please input some text (up to 40 characters): ");
    scanf ("%s", text);
    while (i < strlen (text)) {
        if (i % 2 == 0) {
            evenChar[j++] = text[i];
        }
        else {
            oddChar[k++] = text[i];
        }
        i++;
    }
    evenChar[j] = '\0';
    oddChar[k] = '\0';
    printf ("The even characters are: %s\n", evenChar);
    printf ("The odd characters are: %s\n", oddChar);
    return 0;
}
