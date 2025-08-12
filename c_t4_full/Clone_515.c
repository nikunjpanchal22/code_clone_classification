int main (void) {
    {
        char *tmp;
        char *b = "0101";
        printf ("%d\n", strtol (b, & tmp, 2));
    }
    {
        printf ("%s\n", byte_to_binary (5));
    }
    return 0;
}


 int main (void) {
    char *tmp;
    char *b = "1011";
    printf ("%d\n", strtol (b, & tmp, 2));

    int result = 0;
    int exp = 1;
    for (int i = 0; i <strlen(b); i++)
    {
        if (b[i] == '1')
            result += exp;
        exp <<= 1;
    }
    printf("%d\n", result);
    return 0;
}


