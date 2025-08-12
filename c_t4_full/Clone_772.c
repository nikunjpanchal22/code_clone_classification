int main (void) {
    char str [41];
    printf ("Enter a string (40 characters maximum): ");
    fflush (stdout);
    if (scanf ("%40s", str) == 1) {
        int i;
        printf ("The even string is:");
        for (i = 0; str[i]; i++) {
            if (i % 2 == 0) {
                str[i / 2] = str[i];
            }
            else {
                putchar (str [i]);
            }
        }
        printf ("\n");
        printf ("The odd string is:%.*s\n ", (i + 1) / 2, str);
    }
    return 0;
}


 int main (void) {
    char str [41];
    printf ("Enter a string (40 characters maximum): ");
    fflush (stdout);
    if (scanf ("%40s", str) == 1) {
        char evenstr[21], oddstr[21];
        int i, j;
        for (i = 0, j = 0; str[i]; i++) {
            if (i%2 == 0) {
                evenstr[j] = str[i];
                j++;
            }
            else {
               oddstr[j] = str[i]; 
                j++;
            }
        }
        evenstr[j] = '\0';
        oddstr[j] = '\0';
        printf("The even string is:%s\n", evenstr);
        printf("The odd string is:%s\n", oddstr);
    }
    return 0;
}


