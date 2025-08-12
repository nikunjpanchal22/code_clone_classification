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
        char evenstr[41], oddstr[41];
        int i;
        for (i = 0; str[i]; i++) {
            if (i%2 == 0) {
                evenstr[i/2] = str[i];
            }
            else {
                oddstr[i/2] = str[i];
                printf("%c", str[i]);
            }
        }
        evenstr[i/2] = '\0';
        oddstr[i/2] = '\0';
        printf("\nThe even string is:%s\n", evenstr);
        printf("The odd string is:%s\n", oddstr);
    }
    return 0;
} 


