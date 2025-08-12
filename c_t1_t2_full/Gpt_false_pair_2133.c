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
    char odds [21];
    char evens [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Enter some text of up to 40 characters: ");
    scanf ("%s", text);
    while (i < strlen (text)) {
        if (i % 2 == 0) {
            odds[j++] = text[i];
        }
        else {
            evens[k++] = text[i];
        }
        i++;
    }
    odds[j] = '\0';
    evens[k] = '\0';
    printf ("The even characters are: %s\n", evens);
    printf ("The odd characters are: %s\n", odds);
    return 0;
}
