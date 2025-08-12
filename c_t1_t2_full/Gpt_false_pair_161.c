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
    char String [100];
    char *Tptr;
    size_t i, length;
    printf ("\nEnter the string: ");
    if (fgets (String, sizeof (String), stdin) == NULL)
        return 1;
    Tptr = strtok (String, " \n\r\t");
    while (Tptr != NULL) {
        Tptr[0] = toupper (Tptr[0]);
        length = strlen (Tptr);
        for (i = 0; i < length; i++)
            printf ("%c", Tptr[length - 1 - i]);
        Tptr = strtok (NULL, " \n\r\t");
        if (Tptr != NULL)
            printf (" ");
    }
    printf ("\n");
    return 0;
}
