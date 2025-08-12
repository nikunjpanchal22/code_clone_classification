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


 int main (void) 
{
    char s[] = "This is abc test abc string";
    int i;
    const char delim[] = "abc";
    char *token;
    for(i = 0; (token = strstr(s + i, delim)) != NULL; i = token - s + strlen(delim))
    {
        *token = 0;
        printf ("%s\n", s + i);
    }
    return 0;
}


