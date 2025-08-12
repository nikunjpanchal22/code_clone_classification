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
    const char delim [] = "abc";
    char *token;

    while(str && (token = strstr(str, delim))) {
        int index = token - str;
        *token = '\0';
        printf ("%s\n", str);
        if(strlen(delim))
        {
            str += index + strlen(delim);
        }
    }
    return 0;
}


