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
    char input [41];
    char odds [21];
    char evens [21];
    int i = 0;
    int j = 0;
    int k = 0;
    printf ("Enter a string of up to 40 characters: ");
    scanf ("%s", input);
    while (i < strlen (input)) {
        if (i % 2 == 0) {
            odds[j++] = input[i];
        }
        else {
            evens[k++] = input[i];
        }
        i++;
    }
    odds[j] = '\0';
    evens[k] = '\0';
    printf ("The string of even numbers is: %s\n", evens);
    printf ("The string of odd numbers is: %s\n", odds);
    return 0;
}
