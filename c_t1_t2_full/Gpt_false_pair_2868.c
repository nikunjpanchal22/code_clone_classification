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
    char *string = (char* ) malloc (BUFFSZ +2);
    if (string == NULL) {
        printf ("Memory allocation failure!\n");
        return 1;
    }
    printf ("Enter a string: ");
    if (fgets (string, BUFFSZ +2, stdin) == NULL) {
        printf ("\nInput finished!\n");
        return 1;
    }
    printf ("Your string was: %s", string);
    if (string[strlen (string) - 1] != '\n') {
        printf ("\nYour string was also too long!\n");
    }
    free (string);
    return 0;
}
