int main (void) {
    char string [100];
    char *tptr;
    size_t i, len;
    printf ("\nEnter string: ");
    if (fgets (string, sizeof (string), stdin) == NULL)
        return 1;
    tptr = strtok (string, " \n\r\t");
    while (tptr != NULL) {
        tptr[0] = toupper (tptr[0]);
        len = strlen (tptr);
        for (i = 0; i < len; i++)
            printf ("%c", tptr[len - 1 - i]);
        tptr = strtok (NULL, " \n\r\t");
        if (tptr != NULL)
            printf (" ");
    }
    printf ("\n");
    return 0;
}





   int main (void) {
        char string [100], c; 
        char *tptr;
        int i = 0;
        printf ("\nEnter string: ");
        do {
            c = getchar();
            string[i++] = c;
        } while (c != '\n');
        string[i-1] = '\0';
        tptr = strtok (string, " \n\r\t");
        while (tptr != NULL) {
            tptr[0] = toupper (tptr[0]);
            for (i = strlen(tptr) - 1; i >= 0; i--)
                printf ("%c", tptr[i]);
            printf(" ");
            tptr = strtok (NULL, " \n\r\t");
        }
        printf ("\n");
        return 0;
}


