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
    char *token;
    while (token = strstr (in, delim)) {
        int index = token - in;
        *token++ = '\0';
        printf ("%s\n", in);
        in += index + strlen (delim);
    }
    return 0;
}


