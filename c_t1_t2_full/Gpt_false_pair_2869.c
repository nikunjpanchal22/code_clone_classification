int main (int argc, char *argv []) {
    char *toParseStr = malloc (BUFFSZ +2);
    if (toParseStr == NULL) {
        printf ("Could not allocate memory!\n");
        return 1;
    }
    printf ("Enter a string: ");
    if (fgets (toParseStr, BUFFSZ +2, stdin) == NULL) {
        printf ("\nGot end of file!\n");
        return 1;
    }
    printf ("Your string was: %s", toParseStr);
    if (toParseStr[strlen (toParseStr) - 1] != '\n') {
        printf ("\nIn addition, your string was too long!\n");
    }
    free (toParseStr);
    return 0;
}


int main (int argc, char *argv []) {
    char *buffer = (char* ) malloc (BUFFSZ +2);
    if (buffer == NULL) {
        printf ("Memory allocation failed!\n");
        return 1;
    }
    printf ("Enter a string: ");
    if (fgets (buffer, BUFFSZ +2, stdin) == NULL) {
        printf ("\nNo input left!\n");
        return 1;
    }
    printf ("Your string was: %s", buffer);
    if (buffer[strlen (buffer) - 1] != '\n') {
        printf ("\nYour string was also too long!\n");
    }
    free (buffer);
    return 0;
}
