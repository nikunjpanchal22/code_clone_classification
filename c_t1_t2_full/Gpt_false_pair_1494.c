int main (void) {
    char str [] = "This is abc test abc string";
    char *in = str;
    char *delim = "abc";
    char *token;
    do {
        token = strstr (in, delim);
        if (token)
            *token = '\0';
        printf ("%s\n", in);
        in = token + strlen (delim);
    }
    while (token != NULL);
    return 0;
}


 int main (void) {
    char str [] = "This is abc test abc string";
    char *in = str;
    char *delim = "abc";
    unsigned int length = strlen(delim);
    char *token;
    do {
        token = strstr (in, delim);
        if (token)
            memset (token, 0, length);
        printf ("%s\n", in);
        in = token + strlen (delim);
    } while (token != NULL);
    return 0;
}
