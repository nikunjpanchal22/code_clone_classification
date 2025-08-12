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
    int buff = BUFFSZ +2;
    char *toParseStr = (char *) malloc (buff);
    if (toParseStr == NULL) {
        printf ("Could not allocate memory!\n");
        return 1;
    }
    printf ("Enter a string: ");
    if (fgets (toParseStr, buff, stdin) == NULL) {
        printf ("\nGot end of file!\n");
        return 1;
    }
    printf ("Your string was: %s", toParseStr);
    if (strnlen (toParseStr, buff) == buff - 1) {
        printf ("\nIn addition, your string was too long!\n");
    }
    free (toParseStr);
    return 0;
}


